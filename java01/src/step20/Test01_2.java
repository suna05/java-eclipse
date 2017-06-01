/* JDBC 프로그래밍: 
 * => MySQL JDBC 드라이버를 드라이버 관리자에 등록한다.
 * */
package step20;

import java.sql.DriverManager;

public class Test01_2 {
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
    
    
    //4) 연결이 되었으면 간단한 말을 출력하자
    System.out.println("DBMS와 연결되었음");
    
    //5) DBMS와 연결을 끊고 싶다면 connection의 close를 호출
    con.close();
  }

}
