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
package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test06_1 {
  public static void main(String[] args) throws Exception {
    String driverClassName = System.getProperty("jdbc.driver");

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword="1111";
    
    String name = "홍길동103";
    String email = "hong103@test.com";
    String tel="1111-1111";
    String password = "1111";
    
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
 
  try ( // 이 괄호 안에 선언하는 변수는 오직 java.lang.AutoCloseable 구현체 만이 가능하다.
      Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername,jdbcPassword);    
      Statement stmt = con.createStatement();
  ) {
   
    //변수에 들어있는 값을 가지고 SQL 문을 만드려면 다음과 같이 
    int count = stmt.executeUpdate("insert into memb(name,tel,email,pwd) values('" + 
        name +"', + '" +
        tel + "', '" +
        email +  "',  password('" + 
        password + "'))");

    System.out.println(count);
  } catch (Exception e) {
    e.printStackTrace();
  }

  }

  }







