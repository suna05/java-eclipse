/*상속을 적용하기 전
 * => 
 * */

package step21.ex1;

public class Test01 {
 
  
  
  public static void main(String[] args) {
    Sedan car1 = new Sedan("에쿠스", "현대자동차", 1997,  true);
    
    car1.load(20); //auto-boxing
    //car1.load(new Integer(20));
  }

}
