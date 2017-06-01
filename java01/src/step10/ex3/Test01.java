package step10.ex3;

public class Test01 {

  public static void main(String[] args) {
    
    Calculator c1 = new Calculator();
    
    c1.plus(1);
    c1.plus(2);
    //파라미터의 개수나 타입에 따라 호출될 메서드를 결정한다.
    c1.plus(10, 7);
    c1.minus(5);
    
    
    c1.plus(10,7);
    System.out.println(c1.result);
  }

}
