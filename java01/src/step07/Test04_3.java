/* 인스턴스 메서드와 this변수 2
 * => 
 * 
 *  */
package step07;

public class Test04_3 {
  static class Calculator {
   int result;
   
   Calculator (int value) {  //생성자
     Calculator.this.result = value; 
   }
   
   public void plus(int value) {                                              
     Calculator.this.result += value;
   }
   
   public void minus(int value) {
     Calculator.this.result -= value;
   }
   
  }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator(10);
    
    c1.plus(10);
    
    System.out.println(c1.result);
   
  }

}
