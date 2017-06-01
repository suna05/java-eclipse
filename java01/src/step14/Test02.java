/*제너릭 문법: 사용훟
 * */
package step14;

import java.util.Date;

public class Test02 {
  public static void main(String[] args) {
    //1) 
    Bucket2 b = new Bucket2();
    
    b.setValue(new String("Hello"));
    String str2 = (String)b.getValue();
    
    b.setValue(new Date());
    Date date = (Date)b.getValue();
    
    
    b.setValue(new Integer(10));
    Integer i = (Integer)b.getValue();
   
  }
}
