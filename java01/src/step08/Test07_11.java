/* 컬렉션 클래스 2 : java.util.ArrayList
 * => 내부에서 다루기 때문에 속도가 빠르다.
 * 
 */
package step08;

import java.sql.Date;
import java.util.ArrayList;

public class Test07_11 {
   
  public static void main(String[] args) {
   ArrayList<Date> dateList = new ArrayList<>();
   
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));

    dateList.add(Date.valueOf("2017-5-9"));
    
    Date d1 = Date.valueOf("2017-6-6");
    
    dateList.add(Date.valueOf("2017-6-6"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    dateList.add(2, Date.valueOf("2017-2-22"));
    Date removedObj = dateList.remove(3);
    
    Date oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
    
    for (Date date : dateList) {
      System.out.printf("%d월 %d일\n", date.getMonth()+1, date.getDate());
    }
  System.out.println("=>" + removedObj);
  System.out.println("=>" + oldObj);
  }
  
  
  
  }


