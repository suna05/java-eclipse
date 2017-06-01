/* JDBC 프로그래밍:  Statement와 
 * */
package step20;

import java.sql.DriverManager;

public class Test02_1 {
  public static void main(String[] args) throws Exception {
    //1) MySQL JDBC드라이버 관리 객체 생성
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();    
    
    //2) MySQL JDBC 드라이버를 "드라이버 관리자"에 등록한다.
    //=> 
    DriverManager.registerDriver(mysqlDriver);  
    
    //3) 드라이버 관리자를 통해 DBMS와 연결을 관리한다.
    //  => 직접 MySQL 드라이버를 사용하지 않고, 이렇게 DriverManager 클래스를 통해 우회하여
    java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/webappdb" , "webapp", "1111");    
    
    
    //4) SQL을 실행할 Statement 객체 얻기
    java.sql.Statement stmt = con.createStatement();    
    
    //5) SELECT SQL문을 DBMS에 보낸다.
    java.sql.ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
    
    //6) ResultSet 객체를 통해 서버에 결과를 한 개씩 가져온다.
    //=> 
    while (rs.next()) {
      //서버에서 가져온 한 개의 레코드 값은 ResultSet 객체에 보관되어 있다.
      System.out.printf("%d, %s, %s, %s\n",
          rs.getInt("mno"), 
          rs.getString("name"), 
          rs.getString("tel"), 
          rs.getString("email"));
    }
    
    //7) DBMS와 연결을 끊고 싶다면 connection의 close를 호출
    //
    rs.close();
    stmt.close();
    con.close();
    
  }

}
