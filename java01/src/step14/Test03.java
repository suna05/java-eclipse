/*제너릭 문법: 사용훟
 * */
package step14;

import java.util.Date;

public class Test03 {
  public static void main(String[] args) {
    //2) 
    //Bucket2<String> b = new Bucket2<String>();
    Bucket2<String> b = new Bucket2<>();
    
    b.setValue(new String("Hello"));
    String str2 = b.getValue(); //형변환이 필요없다.
    
    System.out.println(str2);
    
    //String으로 제한했기 때문에 다른 타입 값 X
  
    //b.setValue(new Integer(10));
    //Integer i = (Integer)b.getValue();
   
  }
}
