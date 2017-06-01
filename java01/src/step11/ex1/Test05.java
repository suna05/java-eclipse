package step11.ex1;

import step11.ex1.A;

public class Test05 extends A {
  
  public void test() {
    //this.v1 = 1; //private
    //this.v2 = 2;
    this.v3 = 3; //protected. 
    //상속 받아서 만든 변수이기 때문에 가능(자식 클래스이기 때문에 가능)
    this.v4 = 4; //public
  }
  public static void main(String[] args) {
    A obj = new A();
    //obj.v1 = 1;  private
    
    obj.v2 = 2; //(default). A와 같은 패키지에 있는 클래스이다.
    obj.v3 = 3; //protected. A와 같은 패키지에 있는 클래스이다.
    obj.v4 = 4;
  }
}
