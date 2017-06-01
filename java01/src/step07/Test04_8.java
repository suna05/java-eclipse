/* 클래스 변수와 클래스 메서드
 * => 
 * 
 *  */
package step07;

public class Test04_8 {
  static class Calculator {
   int result;
   
   public static void plus(int value) {                                              
    //인스턴스 변수는 인스턴스 주소가 있어야만 사용할 수 있다.
     //클래스 메서드(=스태틱 메서드) 는 this라는 변수가 없다.
     // 그래서 다음 코드는 오류이다.
     result += value;
   }
   
   public static void minus(int value) {
     this.result -= value;
   }
   
  }
  
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.plus(10);
    System.out.println(Calculator.result);
   
  }

}
