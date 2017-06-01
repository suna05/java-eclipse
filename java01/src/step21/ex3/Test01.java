/*추상 클래스
 * =>
 * */

package step21.ex3;

public class Test01 {
  public static void main(String[] args) {
    Truck car1 = new Truck("타이탄", "비트자동차", 10000);
    
    car1.load("자갈"); //auto-boxing
    //car1.load(new Integer(20));
    car1.run();
    car1.dump();
    
    //Car car2 = new Car(); //추상클래스이기 때문에 인스턴스를 만들 수 없음(컴파일 오류)
    //Loader car3 = new Loader(); //   //(컴파일 오류)
  }
}
