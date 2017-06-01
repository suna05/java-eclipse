/* 유틸리티 클래스 : Properties 클래스 응용2
 * 
 * 
 */
package step08;

import java.io.FileReader;

import java.util.Properties;
import java.util.Set;

public class Test08_3 {
   
  public static void main(String[] args) throws Exception {
    //프로그래밍 아규먼트 출력
    for(String value : args) {
      System.out.println(value);
    }    
    System.out.println("---------------------");
   
    Properties props = System.getProperties();
    //2)
    System.out.printf("name=%s\n", props.get("name"));
    System.out.printf("age=%s\n", props.get("age"));
    //
    
    System.out.printf("tel.home=%s\n", props.get("tel.home"));
    System.out.printf("tel.office=%s\n", props.get("tel.office"));
    
  }
}


