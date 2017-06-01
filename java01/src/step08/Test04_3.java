/* 유틸리티 클래스 : 랩퍼(wrapper) 클래스 3 - auto-boxing 메서드
 * =>
 * => 
 */
package step08; 

public class Test04_3 /*extends Object*/{
 
  public static void main(String[] args) {
    int a = 10;
    Integer obj = new Integer(20);
    
    //개발자가 명시적으로 랩퍼 객체에서 값을 꺼내기
    int b = obj.intValue();
    int c = obj; //auto-unboxing
    
    //개발자가 명시적으로 랩퍼 객체를 만들어 값을 담기.
    Integer obj2 = new Integer(a);
    Integer obj3 = a; //auto-boxing : 원시 타입의 값을 자동으로 랩퍼 객체를 만들어 담는다. 
    Integer obj4 = 40;
    
  }

}
