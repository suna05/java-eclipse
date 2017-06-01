/*nested class(=inner class) : local class
 * => 
 * => 
 * =>
 * =>종류: 
 *     1) 
 *     2) 
 * */

package step13;

public class Test04_1 {

  public static void main(String[] args) {
    //local class
    class A {
      int a;
    }
    
    A obj = new A();
    obj.a = 200;
  }
  
  public static void test() {
    //main() 메서드에 선언된 로컬 클래스는 오직 main()안에서만 사용할 수 있다.
    A obj = new A();
  }

}
