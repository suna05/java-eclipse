package step21.ex6;

//모든 자동차는 Vehicle 규칙에 따라 작성
public abstract class Car implements Vehicle { 
  //abstract추가 , 없으면 에러, 추상 메서드를 정의하기 때문에 run()

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

  //인터페이스에 run() 메서드가 선언되어 있기 때문에 여기서 선언할 필요가 없다.  
  //public abstract void run();

}