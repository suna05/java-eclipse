/* 컬렉션 클래스 2 : java.util.ArrayList
 * => 내부에서 다루기 때문에 속도가 빠르다.
 * 
 */
package step08;

import java.io.FileReader;

import java.util.Properties;

public class Test08_1 {
   
  public static void main(String[] args) throws Exception {
   
    Properties props = new Properties();
    props.load(new FileReader("test.properties"));
  
   
    System.out.println(props.getProperty("key1"));
    System.out.println(props.getProperty("key2"));
    System.out.println(props.getProperty("key3"));
    System.out.println(props.getProperty("key4"));
    System.out.println("--------------------------------");
  
    //properties가 Hashtable 서브 클래스이기 때문에 get()/put()사용가능
    System.out.println(props.get("key1"));
    System.out.println(props.get("key2"));
    System.out.println(props.get("key3"));
    System.out.println(props.get("key4"));
  
  }
}


