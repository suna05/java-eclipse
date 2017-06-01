/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- java.util.HashSet
* => 저장하려는 객체에 대해 hashCode() 호출
 */
package step08;
 
import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;


public class Test07_3 {
   
  public static void main(String[] args) {
    HashSet dateSet = new HashSet();
   
    dateSet.add(Date.valueOf("2017-3-1"));
    dateSet.add(Date.valueOf("2017-5-3"));
    dateSet.add(Date.valueOf("2017-5-5"));
    dateSet.add(Date.valueOf("2017-5-9"));
    Date d1 = Date.valueOf("2017-6-6");
    dateSet.add(d1);
    dateSet.add(d1); //데이터 중복을 허용하지 않는다.
    
    //Set 컬렉션에서 값을 꺼내는 방법
    
    //방법1) 배열을 리턴 받기 : 입력 순서대로 리턴받을 수 없다.
    Object[] valueList = dateSet.toArray();
    for (int i = 0; i< valueList.length; i++) {
      System.out.println(valueList[i]);
    }
    System.out.println("===============");
    //방법2) 값을 꺼내주는 도구를 먼저 얻는다.
   Iterator iterator = dateSet.iterator();
   while (iterator.hasNext()) {
     System.out.println(iterator.next());
   }
    
  }
  
  
  
  }


