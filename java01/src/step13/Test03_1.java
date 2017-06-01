/*nested class(=inner class) : non-static nested class
 * => 
 * => 
 * =>
 * =>종류: 
 *     1) 
 *     2) 
 * */

package step13;

public class Test03_1 {
//인스턴스 멤버들
  int a;
  public void m1() {}
  
  class A {
    int a;
  }

  // 인스턴스 블록에서는 인스턴스 멤버를 사용할 수 있다.
  public void test() {
    a = 20;
    m1();
    
    A obj = new A();
    obj.a = 200;
  }
  
  public static void main(String[] args) {
    Test03_1 obj = new Test03_1();
    obj.test();
    
    //A obj2 = new A(); 컴파일 오류
    
    //사용하는 방법은?
    // => 인스턴스 멤버라는 것을 잊지말아라. 인스턴스 멤버는
   //       인스턴스를 만든 후에 언제든지 사용 가능
    obj.a = 20;
    obj.m1();
    obj.test();
    
    A obj3 = obj.new A(); //OK
    
    //참조 변수를 선언할 때는 인스턴스 주소가 없어도 된다.
  }

}
