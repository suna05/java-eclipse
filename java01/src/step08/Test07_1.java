/* 컬렉션 클래스 2 : java.util.ArrayList
 * => 내부에서 다루기 때문에 속도가 빠르다.
 * 
 */
package step08;

import java.sql.Date;
import java.util.ArrayList;

public class Test07_1 {
   
  public static void main(String[] args) {
   ArrayList dateList = new ArrayList();
   
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));

    dateList.add(Date.valueOf("2017-5-9"));
    
    Date d1 = Date.valueOf("2017-6-6");
    
    dateList.add(Date.valueOf("2017-6-6"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    dateList.add(2, Date.valueOf("2017-2-22"));
    Object removedObj = dateList.remove(3);
    
    Object oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
    
    for (int i = 0; i < dateList.size(); i++) {
      System.out.println(dateList.get(i));
    }
  System.out.println("=>" + removedObj);
  System.out.println("=>" + oldObj);
  }
  
  
  
  }


