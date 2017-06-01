/*예외 처리: finally 블록

 *  */
package step17;

public class Test13 {
  
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        //throw new Exception("한 개의 숫자를 붙이시오");
        System.out.println("[사용법] java -cp bin step17.Test13 숫자");
        return;
      }     System.out.println(Integer.parseInt(args[0]));
    
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      //보통 자원을 해제하는 코드를 둔다.
      //예) 파일 객체를 담기, 소켓 객체를 담기, Db연결을 닫기
      System.out.println("오호라~~~~~~`");
    }
      System.out.println("안녕!!!");
  }   
}


