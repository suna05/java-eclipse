/*예외 처리: throw 명령
 *  */
package step17;

public class Test04 {
  public static void main(String[] args) {
    // 다음과 같이 예외 상황이 발생했을 때 예외 정보를 던질 수 있는 코드를 실행할 때
    //그 예외를 전달받을 코드를 작성해야 한다.
    //try {} catch() {} 문법을 사용하여 처리하라
    try {
      if (args.length < 1) 
        throw new Throwable("애플리케이션 아규먼트가 없습니다.");
      
      int age = Integer.parseInt(args[0]);
          
      if (age < 1)
        throw new Throwable("나이가 유효하지 않습니다.");
    
      System.out.println(age);
    
    } catch (Throwable ex) {
      //예외를 처리하는 코드를 둔다.
      System.out.println(ex.getMessage());
    }

  }
   
}


