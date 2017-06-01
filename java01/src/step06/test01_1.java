/*객체지향 프로그래밍(Object-Oriented Programming: OOP)
 * => 코드를 역할에 따라 분류하여 프로그래밍 하는 방법
 * => 역할에 따라 묶은 코드를 인간이나 사물처럼 하나의 독립된 개체로 간주한다.
 * => 코드를 인간 사회의 흐름과 같이 표현하기 때문에 이해하기 쉽다.
 * => class 라는 문법으로 표현한다.
 * */

package step06;

public class Test01_1 {
  static class Student {
    String name;
    int[] scores = new int[3];
    int total;
    float aver;
  }
}
  public static void main(String[] args) {
  Student s = new Student();

  s.name ="홍길동";
  s.scores[0] = 100;
  s.scores[1] = 90;
  s.scores[2] = 80;
  s.total = s.scores[0] + s.scores[1] + s.scores[2];
  s.aver = s.total /3f;



}
