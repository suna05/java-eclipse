package step21.ex6;

//이제부터는 Tesla도 CarTester 자동차 검사소에서 테스트 할 수 있도록 
//Vehicle 규칙을 준수해야한다.
public class Tesla extends Motor implements Vehicle {
  int charge;
  
  public void doCharge() {
    charge = 100;
  }
  
  //Vehicle에 선언된 메서드 run()을 구현하였다.
  public void run() {
    System.out.println("조용히 달린다.");
  }
}
