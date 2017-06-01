/* 역할 : "High Cohesion" (응집력을 높게 유지하라)
 * => 출력하는 역할은 호출자에게 맡기자. 
 * DAO는 return만 하자.
 */
package step22.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
  Connection con;
  
  public MemberDao(String driver, String url, String username, String password) throws Exception {
    con = DriverManager.getConnection(url, username, password);
    Class.forName(driver);
  }

  // step20/Test04_2참고
  public List<Member> selectList() throws Exception { // ArrayList는 List규칙에 따라 만들었으므로.. 인터페이스를 지정하면 
                                                      // 나중에 다른 데이터구조를 사용할 수 있다. 훨씬 더 유연하다.
//  public ArrayList<Member> selectList() throws Exception { // 예외발생시 호출한 쪽에서 처리해야한다. 
    try ( 
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");) {
      
      ArrayList<Member> list = new ArrayList();
      Member member = null;
      while (rs.next()) { 
        member = new Member(); // 새로 인스턴스 만들고 주소 저장
        member.setNo(rs.getInt("mno")); // 그 주소의 인스턴스에 값 넣기 
        member.setName(rs.getString("name"));
        member.setTel(rs.getString("tel"));
        member.setEmail(rs.getString("email"));
        
        list.add(member);  // ArrayList에 주소 저장
      }
      return list; // 모두 정상적으로 했으면 리턴
      
    } /*catch (Exception e) { // 예외발생시 단순히 호출자에게 보고하기 때문에 여기에서는 catch블록이 필요없다. 
      throw e;
    } */
  }
  
  public int insert(Member member) throws Exception {
    try ( //멤버 클래스로 정의한 객체를 받아서 객체의 메소드를 호출해서 리턴받은 값을 파라미터 값에 넣고
        //그 리턴값으로 insert로 호출해서 
        
        
        //멤버 정보를 담기위해 정의한 멤버의 인스턴스를 받아서, 그 인스턴스로부터 값ㅇ르  꺼내서
        //인파라미터에 넣어서 insert실행 후 몇개가 insert되는지 리턴
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name,tel,email,pwd) values(?,?,?,password(?))");
      ) {
        stmt.setString(1, member.getName());
        stmt.setString(2, member.getTel());
        stmt.setString(3, member.getEmail());
        stmt.setString(4, member.getPassword());
        return stmt.executeUpdate();
      } 
  }
  
  public int delete(int no) throws Exception {
    try (
        //삭제할 데이터 멤버의 넘버를 받아서 에스큐엘 문의 인파라미터에 넣고
        //delete을 실행된 후
        //delete된 개수를 리턴
        PreparedStatement stmt = con.prepareStatement(
            "delete from memb where mno=?");) {
       
      stmt.setInt(1, no);
       return stmt.executeUpdate();
      }
  }
  //삭제될 것은 member
  public int update(Member member) throws Exception {
    try (
        //그 멤버로부터 이름을 꺼내고, 그 멤버 인스턴스로부터 tel을 꺼내고,
        // email, password를 꺼내서, no를 꺼내서 sql의 인파라미터에 순서대로 넣고
        //그 에스큐엘문을 실행한다음 변경된 개수를 리턴한다.
        //예외가 발생하면 호출자에게 예외를 던진다고 선언
        //try쓰는 이유는 : close()를 자동화하기 때문에
        PreparedStatement stmt = con.prepareStatement(
            "update memb set name=?, tel=?, email=?, pwd=password(?) where mno=?");
      ) {
        stmt.setString(1, member.getName());
        stmt.setString(2, member.getTel());
        stmt.setString(3, member.getEmail());
        stmt.setString(4, member.getPassword());
        stmt.setInt(5, member.getNo());
       
        return stmt.executeUpdate();
      } 
  }
}