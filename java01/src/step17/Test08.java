/*예외 처리: throws 선언
 * => 예외를 발생시키는 코드를 작성할 때
 *      당장 예외 처리를 하고 싶지 않다면,
 *      메서드 선언부에 그 예외 정보를 적시하면 된다.
 *      
*  */
package step17;

public class Test08 {
  public static void main(String[] args) 
      throws Exception, IllegalArgumentException, NumberFormatException {     
    
      if (args.length < 1) 
        throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
      
      int age = Integer.parseInt(args[0]);
          
      if (age < 1)
        throw new Exception("나이가 유효하지 않습니다.");
    
      System.out.println(age);
        
    } 
  }   


