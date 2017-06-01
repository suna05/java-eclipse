/*프로그램 아규먼트
 * => 프로그램을 실행할 때 넘겨주는 값
 * => 예) 
 *        > java -cp bin step08.Test01_1 aaa bbb 111
 * => 위와 같이 클래스 이름 뒤에 값을 주게 되면 
 * main() 메서드의 파라미터 값으로 넘어온다.
 * */
package step08;

public class Test01_1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(args.length);
      for(String str: args) {
        System.out.println(str);
      }
  }

}
