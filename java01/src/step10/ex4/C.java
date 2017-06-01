package step10.ex4;

public class C extends B {
  int c;
  
  public void m2() { //B클래스의 m2() 재정의
    System.out.println("C.m2()");
  }
  
  public void m3() { //A클래스의 m3() 재정의
    System.out.println("C.m3()");
  }
  
  public void m5() {  //새로 추가
    System.out.println("C.m5()");
  }
  
  
  public void test1() {
    m1();  // B의 m1()
   m2(); //C의 m2()
    m3(); //C의 m3()
  }
    //super사용 => 재정의 하기 전의 메서드
  public void test2() { 
    super.m1();  //B.m1() <-  C에서 재정의 안했으면 상속 받은 메서드를 가리킨다.  
                                        //super는 무시된다.
    super.m2();  //B.m2()
    super.m3(); //A.m3()
    super.m4();  //super 클래스에 해당 메서드가 있는지, m4()
    m4();   //B.m4();
    m5(); //C.m5  super가 안붙어 있으면 현재 클래스부터 찾음.
    //super.m5(); //재정의 하거나 상속 받은 메서드가 아니기 때문에
                      //컴파일 오류
                        //조상 중에 m5() 메서드가 어디에도 없다.
  }
}
