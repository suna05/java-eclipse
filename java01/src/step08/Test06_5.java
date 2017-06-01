/* 컬렉션 클래스 : ArrayList 제네릭 사용 후
 * => 배열을 이용하여 데이터 목록을 다루는 ArrayList구현
 * 
 */
package step08;

import java.sql.Date;


public class Test06_5 {
   
  public static void main(String[] args) {
    Test06_5_ArrayList<Date> dateList = new Test06_5_ArrayList<>();


    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));

    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    for (int i = 0; i < dateList.size(); i++) {
      Date d = dateList.get(i);
      System.out.printf("%d월 %d일\n", d.getMonth()+1, d.getDate());
    }
 
  }
  
  
  
  }


