/* 유틸리티 클래스
 * 
 * 
 */
package step08;

import java.io.FileReader;

import java.util.Properties;
import java.util.Set;

public class Test08_2 {
   
  public static void main(String[] args) throws Exception {
   //JVM의 프로퍼티 값을 가져온다.
    Properties props = System.getProperties();
  
    Set<Object> keySet = props.keySet();
    for (Object key: keySet) {
      System.out.printf("%s = %s\n", key, props.get(key));
    }
    
  }
}


