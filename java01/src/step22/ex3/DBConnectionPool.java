package step22.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;



public class DBConnectionPool {
  String url;
  String username;
  String password;
  
  //
  ArrayList<Connection> conList = new ArrayList<>();
  
  public DBConnectionPool(String driver, String url, String username, String password)  
      throws Exception {
    Class.forName(driver);
    this.url = url;
    this.username = username;
    this.password = password;
  }
  
  //DB 커넥션 객체를 임대해주는 메서드
  public Connection getConnection() throws Exception {
    if (conList.size() > 0) {
      return conList.remove(0); //현재 목록 컬렉션에서 0번째것을 제거하고 제거된것이 리턴됨.
    }
    
    //컬렉션에 없으면 새로 만들어서 리턴
    return DriverManager.getConnection(this.url, this.username, this.password);
  }
  
  //DB커넥션 객체를 반납
  public void returnConnectrion(Connection con) {
    conList.add(con);
    
  }
}
