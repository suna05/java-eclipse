/* JDBC 프로그래밍: PreparedStatement 객체 사용 후
 * => 더하기 연산자를 사용하여 SQL문을 만드는 대신,
 *    in-parameter '?'를 사용하여 SQL문을 만든다.
 */
package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test05_3 {

  public static void main(String[] args) throws Exception {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    

    String email = "hong102@test.com' or email like('hong1%') or email='ㅋㅋ ";

  
    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    try (
      Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
      
       Statement stmt = con.createStatement();
   
    ) {
      int count = stmt.executeUpdate("delete from memb where email='" + email + "'");
     
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}





