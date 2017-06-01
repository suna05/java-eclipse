/* 클래스 변수와 클래스 메서드
 * => 
 * 
 *  */
package step07;

public class Test04_5 {
  static class Calculator {
   static int result;
   
   public static void plus(int value) {                                              
     //Calculator.result += value;  //class 메서드나 static 블록에서는 this변수가 없다. 컴파일 오류
     //다음 코드는 this가 생략된 것이아니라 class이름이 생략된 것임.
     result += value;
   }
   
   public static void minus(int value) {
     result -= value;
   }
   
  }
  
  public static void main(String[] args) {
    
    Calculator.plus(10);
    
    System.out.println(Calculator.result);
   
  }

}
