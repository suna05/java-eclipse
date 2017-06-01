/* 유틸리티 클래스 : java.util.date 클래스와 import 명령문
 * => 클래스를 사용하려면 반드시 패키지 명을 적어야한다.
 * => 단 
 */
package step08; 

import java.util.Date;

public class Test05_3{
 
  public static void main(String[] args) {
        
    Date today = new Date();
    
    
    System.out.println(today.getYear() + 1900);
    System.out.println(today.getMonth() + 1);
    System.out.println(today.getDate());
    System.out.println(today.getDay());
    System.out.println(today.getHours());
    System.out.println(today.getMinutes());
    System.out.println(today.getSeconds());   
    System.out.println(today.getTime());
    
    /*Deprecated Method
     * => 향후 제거될 메서드이니 사용하지 말라고 권고하는 메서드이다.
     * => 왜 제거하려는 건가? 
     *      좀 더 유지보수 하기 좋게 다른 클래스로 기능을 이전하였기 때문이다.*/
  }

}
