/*유틸리티 클래스: String2 - 레퍼런스 비교
 * => ==연산자는 해당 변수에 저장된 값을 비교한다.
 *      따라서 같은 값을 갖고 잇는 인스턴스라 하더라도
 *      
 * */
package step08;

public class Test02_2 {

  public static void main(String[] args) {
    
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    
    
    
    if (s1 == s2) {  
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }

       
  }

}
