/*인터페이스 사용 후
 * => CarTester와 테스트 대상이 되는 자동차 사이에 호출규칙을 정의한다.
 *=> 인터페이스를 이요하여 호출 규칙을 정의
 *      즉 "인터페이스"는 호출자와 호출 당하는 자 사이의 
 *      호출 규칙을 정의할 때 사용하는 문법이다.
 * => 작업
 *      1) "Vehicle" 인터페이스를 정의
 * */

package step21.ex6;

public class Test01 {
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    Sedan car2 = new Sedan("티코", "비트자동차", 980, true);
    Bulldozer car3 = new Bulldozer("제우스", "비트자동차", 20000);
    Tesla car4 = new Tesla();
    
    car1.run();
    car2.run();
    car3.run();
    car4.run();
    
    System.out.println("[Truck 테스트]-------------------");
    CarTester.test(car1);
    
    System.out.println("[Sedan 테스트]-------------------");
    CarTester.test(car2);
    
    System.out.println("[Bulldozer 테스트]-------------------");
    CarTester.test(car3);

    System.out.println("[Tesla 테스트]-------------------");
    CarTester.test(car4);

  }
}
