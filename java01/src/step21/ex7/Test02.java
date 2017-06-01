package step21.ex7;

public class Test02 {
  public static void main(String[] args) {
    //추상 클래스의 레퍼런스 변수에는 그 서브 클래스의 인스턴스를 저장할 수 있다.
    
    B obj;
    
    //obj = new C(); //C는 추상 클래스이다. 인스턴스 생성 불가
    obj = new D();
  
    obj.m2();
  }
}
