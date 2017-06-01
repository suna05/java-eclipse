package step09.ex4;

public class C extends B {
  int c;
  
  public C() {
    //super(); 컴파일러가 자동으로 붙인다.
                  //문제: C의 수퍼클래스인 B에는 기본 생성자가 없다.
                  //        그래서 컴파일 오류가 발생한다.
    //해결 방법
   //=> 수퍼 클래스에 있는 생성자를 호출하라!
    super(7);
    System.out.println("C()");
  }
}
