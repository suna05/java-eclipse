/*nested class(=inner class) : non-static nested class
 * => inner 클래스에서 바깥 클래스의 this 사용하기
 * */

package step13;

public class Test03_2 {
  int v1;
  int v2;
  
  class A {
    int v1;
    public void m1() {
      this.v1 = 100;
      System.out.printf("A.v1 = %d\n", this.v1);
      
      //inner 클래스에서 바깥 클래스의 인스턴스 변수를 사용하기
      //inner 클래스도 Test03_2의 인스턴스 멤버이다.
      //그러니 
      System.out.printf("Test03_2.v2 = %d\n", v2);
      
      
      System.out.printf("A.v1 = %d\n", v1);
      
      
      System.out.printf("Test03_2.v1 = %d\n", Test03_2.this.v1);
    }
  }
  
  public void test() {
    A p = new A();
    p.m1();
    System.out.printf("v1 = %d, v2 = %d\n", this.v1, this.v2);
  }
  
  
  public static void main(String[] args) {
   Test03_2 obj = new Test03_2();
   obj.v1 = 10;
   obj.v2 = 20;
   obj.test();
  }

}
