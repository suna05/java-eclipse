/*인터페이스1
 * => 인터페이스는 호출 규칙을 정의하는 것이기 때문에  추상 메서드만 선언 가능
 * */
package step21.ex8;

public interface A {
  //1) 규칙이기 때문에 공개 메서드이고, 추상 메서드이다.
  public abstract void m1();
  
  //2) public을 생략해도 내부적으로 public으로 간주한다.
  abstract void m2();
  
  //3) abstract을 생략해도 내부적으로 abstract로 간주한다.
  void m3();
  
  //4) 
  //void m4() {} //컴파일 오류
  
  
  //[필드 선언 규칙]
  //1) 규칙이기 대문에 무조건 공개 필드이고
  public static final int v1 = 200;
  
  //2) public을 생략하면 내부적으로 public으로 간주한다.
  static final int v2 = 200;
  
  //3) static을 생략하면 내부적으로 static으로 간주한다.
  final int v3 = 200;
  
  //4)
  int v4 = 200;
  
  

}
