package step21.ex3;

public abstract class Car { //abstract추가

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

  public void run() {
    System.out.println("간다.");
  }

}