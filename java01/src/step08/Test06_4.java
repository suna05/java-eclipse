/* 컬렉션 클래스 : ArrayList
 * => 배열을 이용하여 데이터 목록을 다루는 ArrayList구현
 * 
 */
package step08;

import java.sql.Date;


public class Test06_4 {
   
  public static void main(String[] args) {
    Test06_2_ArrayList dateList = new Test06_2_ArrayList();


    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));

    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    for (int i = 0; i < dateList.size(); i++) {
      Date d = (Date)dateList.get(i);
      System.out.printf("%d월 %d일\n", d.getMonth()+1, d.getDate());
    }
 
  }
  
  
  
  }


