package step21.ex5;

public abstract class Car { //abstract추가 , 없으면 에러, 추상 메서드를 정의하기 때문에 run()

  protected String model; //protected: 같은 패키지 및 자식 패키지 접근 가능
  protected String maker;
  protected int cc;

  public Car() {
    super();
  }
  
  public Car(String model, String maker, int cc) {
    this.model = model;
    this.maker = maker;
    this.cc = cc;
  }

  //이 메서드는 어차피 서브 클래스에서 무조건 재정의할 것이다.
  // 또는 재정의하도록 강제하고 싶다.
  // 그렇다면 여기서 코딩하지 말라!
  //단지 어떤 메서드인지 선언만 하라!
  /*
  public abstract void run() { //컴파일 오류
    System.out.println("간다.");
  }
  */
  
  public abstract void run();

}