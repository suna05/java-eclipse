package step11;

import step11.ex1.A;

public class Test03 {
  public static void main(String[] args) {
    A obj = new A();
    //obj.v1 = 1;  private
    
    //obj.v2 = 2; //(default)
    //obj.v3 = 3; //protected
    obj.v4 = 4;
  }
}
