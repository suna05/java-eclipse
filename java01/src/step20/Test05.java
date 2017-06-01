package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test05 {
  public static void main(String[] args) throws Exception {

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword="1111";

    String name = "홍길동102";
    String email = "hong102@test.com";
    String tel = "1111-1111";
    String password = "1111";

    try {
      Class.forName(jdbcDriver);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try ( // 이 괄호 안에 선언하는 변수는 오직 java.lang.AutoCloseable 구현체 만이 가능하다.
        Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername,jdbcPassword);    
        //SQL문을 미리 준비해 둔다. 값이 들어갈 자리는 ?를 사용하여 비워둔다.
        //이때 ?를 in-parameter 라고 부른다.
        //java.sql.PreparedStatement
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name,tel,email,pwd) values('?, ?, ?, password(?))");
        ) {

      //
      stmt.setString(1, name);
      stmt.setString(2, tel);
      stmt.setString(3, email);
      stmt.setString(4, password);

      
      //
      int count = stmt.executeUpdate();
      
      /*
      int count = stmt.executeUpdate("insert into memb(name,tel,email,pwd) values('" + 
          name +"', + '" +
          tel + "', '" +
          email +  "',  password('" + 
          password + "'))");
*/
      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}







