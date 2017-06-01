/* JDBC 프로그래밍: MySQL JDBC Type4 드라이버 다운로드
 * =>1) https://mvnrepository.com/search?q=mysql > MySQL Connector/J 클릭 후 설치
 * > mysql --version 확인 후 자신에게 맞는 버전 다운
 * => 2)compile group: 'mysql', name: 'mysql-connector-java', version: '5.1.42' > build.gradle에 추가
 * 

 * */
package step20;


public class Test01_1 {
  public static void main(String[] args) throws Exception {
    //1) MySQL JDBC드라이버 관리 객체 생성
    com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();    
    
    

  }

}
