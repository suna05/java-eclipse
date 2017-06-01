/* 클래스 메서드들끼리 호출하기
 * => 
 * 
 *  */
package step07;

public class Test04_9 {
  static class Calculator {
     
   public static void m1() {                                              
     //메서드 호출할 때 클래스 명이 안붙으면 자동으로 붙임
     m2(); //Calculator.m2();
   }
   
   public static void m2() {
     m3();
   }
   
   public static void m3() {     
     System.out.println("m3()");
   }
   
  }
  
  public static void main(String[] args) {
    Calculator.m1();
  
   
  }

}
