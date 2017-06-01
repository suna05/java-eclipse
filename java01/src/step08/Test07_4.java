/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- java.util.HashSet 2
* => 저장하려는 객체에 대해 hashCode() 호출
 */
package step08;
 
import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;


public class Test07_4 {
   
  public static void main(String[] args) {
    HashSet Set = new HashSet();
   
    
    Set.add(new String("홍길동"));
    Set.add(new String("임꺽정"));
    Set.add(new String("유관순"));
    Set.add(new String("윤봉길"));
    Set.add(new String("안중근"));
    Set.add(new String("김구"));
    Set.add(new String("김구")); 
    //"김구"문자열인 경우에 다른 인스턴스임에도 불구하고 중복되지 않는다.
    /*왜??
     * => Set은 객체(의 주소)를 저장할 때 그 객체에 대해 hashCode() 메서드를
     *      그 리턴 값으로 위치를 계산한다.
     * => String 클래스는 같은 값을 갖는 경우 hash value를 리턴하도록
     *      hashCode()를 오버라이딩 하였다.
     *      즉 위의 두 ㄱ의 
     * */
    
    System.out.println(new String("김구").hashCode());
    System.out.println(new String("김구").hashCode());
    System.out.println(new String("김구").hashCode());
    
    /*결론!
     *HashSet 컬렉션에 값을 저장할 때
     * 인스턴스의 주소가 영향을 끼치는 것이 아니라 
     * hashCode()의 리턴값이 영향을 끼친다.
     * */
    
    //방법2) 값을 꺼내주는 도구를 먼저 얻는다.
   Iterator iterator = Set.iterator();
   while (iterator.hasNext()) {
     System.out.println(iterator.next());
   }
    
  }
  
  
  
  }


