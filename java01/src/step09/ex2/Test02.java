/* 상속 문법을 사용한 후 II
 * => 요구사항
 *    - 우리는 BasicCalculator에 곱하기 기능을 추가시키고 싶다.
 * => 해결 방법
 *     1)
 *     2)
 */ 
package step09.ex2;

public class Test02 {
  public static void main(String[] args) {
    AdvancedCalculator calc = new AdvancedCalculator();
    calc.plus(100);
    calc.plus(20);
    calc.minus(30);
    calc.multiple(2);
    System.out.println(calc.result);
  }
}
