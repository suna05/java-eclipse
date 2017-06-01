/*역할:
 * => memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스*/
package step22.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDao {
//  String driver;
//  String url;
//  String username;
//  String password;
  Connection con;
  
  //기본생성자를 제거
  //생성자의 존재이유? 인스턴스를 쓰기 전에 최소한 유효한 값으로 설정시켜서
  //사용할 수 있도록 기회를 주는 것.
  public MemberDao(String driver, String url, String username, String password) 
      throws Exception {
//                  this.driver = driver;
//                  this.url = url;
//                  this.username = username;
//                  this.password = password;   
//                  
                  Class.forName(driver);
                  con = DriverManager.getConnection(url, username, password);
                }
  
  public void selectList() {
        
    try (  //어떤 객체가 채워지려면 유효한 값으로 세팅시키는 방법 -> 
        //제거: 인스턴스 변수 있는거 쓰면 됨.Connection con = DriverManager.getConnection(this.url, this.username, this.password);
      
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");) {
        while (rs.next()) { 
          System.out.printf("%d, %s, %s, %s\n", 
              rs.getInt("mno"), 
              rs.getString("name"), 
              rs.getString("tel"), 
              rs.getString("email"));
        }
        
      } catch (Exception e) {
        e.printStackTrace();
      }    
  }


public void insert(String name, String email, String tel, String password) {
  
  try (
      //Connection con = DriverManager.getConnection(url, username, password);      
       PreparedStatement stmt = con.prepareStatement(
          "insert into memb(name,tel,email,pwd) values(?,?,?,password(?))");) {
     
      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setString(3, tel);
      stmt.setString(4, password);
    
      int count = stmt.executeUpdate();

      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  
  }

public void delete(int no) {
  
  try (
      //Connection con = DriverManager.getConnection(url, username, password);      
       PreparedStatement stmt = con.prepareStatement(
          "delete from memb where mno=?");) {
     
      stmt.setInt(1, no);    
      int count = stmt.executeUpdate();
      System.out.println(count);

  } catch (Exception e) {
      e.printStackTrace();
    }
  
  }



public void update(int no, String email, String name,  String tel, String password) {  
  try (
      //Connection con = DriverManager.getConnection(this.url, this.username, this.password);      
       PreparedStatement stmt = con.prepareStatement(
          "update memb set name=?, email=?, tel=?, pwd=password(?) where mno=?");) {
     
      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setString(3, tel);
      stmt.setString(4, password);
      stmt.setInt(5, no);    
      int count = stmt.executeUpdate();

      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  
  }

}
