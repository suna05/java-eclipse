/*리터럴 - 논리값 리터럴*/
package step01;

public class Test09 {
  public static float xxx= 12.375f;
  
  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);
    
    if (true) {
      System.out.println("참이다1");
     } 
    
    if (false) {
      System.out.println("참이다.2");
    }
    
    if (1) { //오류
      System.out.println("참이다3");
    }
  }
}
