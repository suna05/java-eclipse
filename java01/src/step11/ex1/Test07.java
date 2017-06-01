/*캡슐화:
 * => 패키지 멤버 클래스?
 *      소스 파일 가장 밖에 선언한 클래스.
 *      일반적으로 작성하는 클래스이다.
 *  => (default): 아무것도 붙이지 않는 것
 * */

package step11.ex1;

public class Test07 {
  
  public static void main(String[] args) {
    //public 클래스는 다른 패키지에서 접근할 수 없다.
    step11.ex1.A obj1 = new step11.ex1.A();
    //(default)클래스는 같은 패키지에서만 접근할 수 있다.
    //=> Test07은 B클래스와 같은 패키지에 있기 때문에 접근 가능!0
    step11.ex1.B obj2 = new step11.ex1.B(); //OK
  }
}
