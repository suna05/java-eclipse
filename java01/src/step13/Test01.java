/*nested class(=inner class)
 * => 클래스나 메서드 안에 클래스를 정의하는 문법
 * => 
 * =>
 * =>종류: 
 *     1) 
 *     2) 
 * */

package step13;

//package member class
public class Test01 {
  
  //static nested class
  static class A {}
  
  //non-static nested class
  class B{}
  
  public static void main(String[] args) {
  //local class
    class C {}
    
    //anonymous class
    Object obj = new Object() {};
    

    //lamda로 nested 클래스 표현
    Runnable obj2 = () -> {};
    
    
  }

}
