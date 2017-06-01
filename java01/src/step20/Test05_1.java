package step20;

import java.sql.Connection;

/* JDBC 프로그래밍: Statement 객체 - INSERT 실행
 * => Statement.executeUpdate()
 *    - INSERT, UPDATE, DELETE 등 DML, DDL을 실행한다.
 *    - 리턴 값은 명령어 영향을 받은 레코드 개수이다.
 *      예) INSERT -> 등록된 레코드 개수,
 *          UPDATE -> 변경된 레코드 개수,
 *          DELETE -> 삭제된 레코드 개수 
 */

import java.sql.DriverManager;
import java.sql.Statement;

public class Test05_1 {
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







