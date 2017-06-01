/*추상 클래스3

 * */

package step21.ex7;

//C는 상속받은 메서드 중에서 추상메서드를 구현하지 않았기 때문에
//추상 클래스로 선언해야 한다.
public abstract class C extends B {
  public void m3() {
    System.out.println("B.m3()....");
  }
}
