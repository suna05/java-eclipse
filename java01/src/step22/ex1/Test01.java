/*5월 30일
 * -클래스 사용 
 * 1) 사용자 정의 데이터 타입
 * 2) 데이터 다루는 코드를 별로의 클래스로 분류
 *
 *=> 작업
 *    1) memb 테이블의 등록, 조회, 변경, 삭제를 다루는 DAO클래스를 만든다.
 *        예) MemberDao
 *    2) 
 * */
package step22.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test01 {
  public static void main(String[] args) throws Exception {
    String driverClassName = System.getProperty("jdbc.driver");

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword="1111";
    
    MemberDao memberDao = new MemberDao(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    memberDao.selectList(); 
    System.out.println("-------------------------------------------------");
    
    //String name = "홍길동104";
    //String email = "hong104@test.com";
   // String tel="1111-1111";
   // String password = "1111";
    /*
    memberDao.delete(91);
    memberDao.selectList();
    System.out.println("-------------------------------------------------");
    */
    /*
   memberDao.insert("홍길동104","1111-1111", "hong104@test.com", "1111");
   memberDao.selectList();
   System.out.println("-------------------------------------------------");
   */
   
   memberDao.update(91, "홍길동변경", "hong104@test.com", "1111-2222", "1313");
   memberDao.selectList();
   System.out.println("-------------------------------------------------");
   
  }

 }







