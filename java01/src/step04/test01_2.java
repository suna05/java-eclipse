/*문장: 조건문 if와 중괄호{} */
package step04;

public class test01_2 {

  public static void main(String[] args) {
    if (false) 
      System.out.println("홍길동");
      System.out.println("임꺽정");
      
      System.out.println("-------------");
      
      /*중괄호를 사용하지 않으면, 첫 번째 문장만 if 에 소속된다. */
      if (false) { 
        System.out.println("홍길동");
        System.out.println("임꺽정");
      }
  }

}
