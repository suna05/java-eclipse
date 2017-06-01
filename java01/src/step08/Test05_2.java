/* 유틸리티 클래스 : java.util.date 클래스 
 * => 년, 월, 일, 시, 분, 초 값 꺼내기
 */
package step08; 

public class Test05_2{
 
  public static void main(String[] args) {
    //인스턴스를 만들면 현재 시간을 보관하고 있는 객체가 생성됨.
   //현재 날짜 및 시간 알아내기
    java.util.Date today = new java.util.Date();
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
