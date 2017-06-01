/*class 문법의 용도 : 관련된 메서드를 묶는 용도 6
 * => 변수를 개별적으로 관리하고 싶다면, static을 붙이지 마라.
 * => static이 붙지 않은 변수를 "인스턴스 변수"라 부른다.
 *      이 변수는 new라는 명령에 의해 생성된다.
 * =>  즉 static이 붙지 않은 변수는 new 명령을 사용하여 명시적으로 생성해야 한다.
 * */

package step06;

public class test02_6 {
   
  public static void main(String[] args) {
   //값을 개별적으로 관리하기 위해서 그 값을 개별적으로 보관할 변수들을 만들어야한다.
    // 그 방법은 클래스의 인스턴스를 생성하는 방법
    Member2 m1 = new Member2();
    Member2 m2 = new Member2();
    Member2 m3 = new Member2();
    
    Member2.init(m1, "홍길동", 100, 100, 100);
    Member2.init(m2, "임꺽정", 90, 90, 90);
    Member2.init(m3, "유관순", 80, 80, 80); //기존의 Member 클래스에 있는 변수 값을 변경
    
    Member2.compute(m1);
    Member2.compute(m2);
    Member2.compute(m3);
    
    
    Member2.print(m1);
    Member2.print(m2);
    Member2.print(m3);
    
  }

}
