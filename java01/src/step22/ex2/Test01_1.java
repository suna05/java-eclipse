/* 
 */
package step22.ex2;

import java.util.List;

public class Test01_1 {

  public static void main(String[] args) throws Exception {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    MemberDao memberDao = new MemberDao(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    List<Member> list = memberDao.selectList();
    for (Member m : list) {
      System.out.printf("%d ,%s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    
    System.out.println(memberDao.delete(91));
    System.out.println("-----------------------------------------");
    

   
    Member member = new Member();
    member.setNo(92);
    member.setName("홍길동 변경");
    member.setTel("111-1111");
    member.setEmail("hong104@test.com");
    member.setPassword("111");
    
    memberDao.update(member);
    System.out.println("-----------------------");
    
    list = memberDao.selectList();
    for (Member m : list) {
      System.out.printf("%d ,%s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    
    
  }
}





