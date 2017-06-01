package step21.ex8;

//인터페이스는 다중 구현이 가능하다.
//인터페이스에 선언된 메서드는 모두 구현되지 않은 메서드이기 때문
public class MyClass implements B, C/*, E : 하면 public void m5()가 return 타입이 달라서 에러발생*/  {
  //B와 C의 수퍼 인터페이스인 A의 메서드 구현
    public void m1() {}
    public void m2() {}
    public void m3() {}
        
    //B에 선언된 메서드 구현
    public void m4() {}
    public void m5() {}
    
    //C에 선언된 메서드 구현
    //
    public void m6() {}
}
