/* 유틸리티 클래스 : 랩퍼(wrapper) 클래스 2 - equals 메서드
 * =>
 * 
 */
package step08; 

public class Test04_2 /*extends Object*/{
 
  public static void main(String[] args) {
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));
    System.out.println("----------------");
    /*String 클래스와 랩퍼 클래스는 equls() 메서드를 재정의하였다.
     * => 어떻게?
     *        주소가 아닌 값이 같은ㅈ ㅣ 비교하도록 재정의하였따.*/
    
    StringBuffer s1 =new StringBuffer("Hello");
    StringBuffer s2 = new StringBuffer("Hello");
    
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    /*StringBuffer 클래스는 */
  }

}
