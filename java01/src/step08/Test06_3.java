/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- LinkedList
 * => Linked list 알고리즘을 이용하여 데이터 목록을 다루는 LinkedList 구현
 * => 배열은 고정된 크기의 메모리를 만들어 사용하기 때문에,
 *      배열의 크기를 늘리게 되면 이전 배열의 값을 새 배열로 복사해야 하는
 *      작업이 필요하다.
 *      => 단점
 *            배열을 복사하는데 시간 소요
 *            이전의 배열은 가비지가 되기 때문에 메모리를 비효율적으로 사용하게 된다
 */
package step08;
 
import java.sql.Date;

public class Test06_3 {
   
  public static void main(String[] args) {
    Test06_3_LinkedList dateList = new Test06_3_LinkedList();
   
    dateList.add(Date.valueOf("2017-3-1"));
    dateList.add(Date.valueOf("2017-5-3"));
    dateList.add(Date.valueOf("2017-5-5"));

    dateList.add(Date.valueOf("2017-5-9"));
    dateList.add(Date.valueOf("2017-6-6"));
    
    
    System.out.println(dateList.size());
   
    
    dateList.add(3, Date.valueOf("2017-2-22"));
    
    Object removedObj = dateList.remove(3);
    
    Object oldObj = dateList.set(1, Date.valueOf("2017-5-4"));
   
    for (int i = 0; i < dateList.size(); i++) {
      System.out.println(dateList.get(i));
    }
    System.out.println("=>" + removedObj);
 
    System.out.println("=>" + oldObj);
  }
  
  
  
  }


