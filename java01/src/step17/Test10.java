/*예외 처리: throws 선언 3
 * => java.lang.RuntimeException 계열의 예외를 던질 때는 
 *      메서드 선언 부에 throws를 두는 것이 선택사항이다.
 *  */
package step17;

public class Test10 {
  
  public static void main(String[] args)  /*thows IllegalArgumentException, NumberFormatException*/
    throws Exception
  {
    
      if (args.length < 1) 
        throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
      
      int age = Integer.parseInt(args[0]);
          
      if (age < 1)
        throw new Exception("나이가 유효하지 않습니다.");
    
      System.out.println(age);
        
    } 
  }   


