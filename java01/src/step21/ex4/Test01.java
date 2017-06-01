/*추상 메서드
 * => 서브 클래스마다 기능을 다루는 방법이 다를 것 같으면
 *      굳이 수퍼 클래스에서 그 메서드를 정의하지 말라!
 * => 또는 서브 클래스에게 특정 메서드를 반드시 구현하도록 강요(강제)하고 싶다면
 *      수퍼클래스에서 그 메서드를 정의하지 말라!
 * => 
 * */

package step21.ex4;

public class Test01 {
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    
    car1.load("자갈"); //auto-boxing
    //car1.load(new Integer(20));
    car1.run();
    car1.dump();
    
    //Car car2 = new Car(); //추상클래스이기 때문에 인스턴스를 만들 수 없음(컴파일 오류)
    //Loader car3 = new Loader(); //   //(컴파일 오류)
  }
}
