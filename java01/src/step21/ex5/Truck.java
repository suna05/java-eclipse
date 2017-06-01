package step21.ex5;

public class Truck  extends Loader {
  //Object storage; => Loader클래스에서 정의했음
 
  
  public Truck(String model, String maker, int cc) {
    super(model, maker, cc);
  }
  
  
//상속 받은 메서드를 서브 클래스의 역할에 맞게끔 재정의하자. 오버라이딩
  public void run() {
    System.out.println("부왕~  힘차게 달린다.");
  }
  
  //수퍼클래스 Loader의 load()를 오버라이딩 한다.
  public void load(Object obj) {
    if (obj != null) {
      super.load(obj);
    } else {
      System.out.println("비었습니다.");
    }
  }
  
  public void dump() {
    if (storage != null) {
    System.out.printf("%s를 내렸습니다.", this.storage);
    this.storage = null; //내렸으니까 null로 세팅
    } else {
      System.out.println("내릴 것이 없습니다.");
    }
  }
}
