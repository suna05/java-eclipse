/* 클래스 변수와 클래스 메서드
 * => 
 * 
 *  */
package step07;

public class Test04_6 {
  static class Calculator {
   static int result;
   
   public void plus(int value) {                                              
    Calculator.result += value;
   }
   
   public void minus(int value) {
     Calculator.result -= value;
   }
   
  }
  
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.plus(10);
    System.out.println(Calculator.result);
   
  }

}
