/*예외 처리: 일반모드(Exception 계열 예외)와 스텔스 모드(Error와 RunTimeException계열 예외)
 * => java.lang.RuntimeException 계열의 예외를 던질 때는 
 *      메서드 선언 부에 throws를 두는 것이 선택사항이다.
 *  */
package step17;

public class Test11 {
  
  static void m1(int v) throws Exception {
    m2(v);
  }
  
  static void m2(int v) throws Exception {
    m3(v);    
  }
  
  
  static void m3(int v) throws Exception {
    m4(v);    
  }
  
  static void m4(int v)  throws Exception  {  
    if ( v< 0)
      throw new Exception("음수는 허용하지 않습니다.");
    System.out.println(v);    
 }

  
  public static void main(String[] args) {
    try {
      if (args.length < 1) {
        System.out.println("[사용법]java -cp bin step17.Test11 숫자");
      return ;
      }
    m1(Integer.parseInt(args[0]));
    
    
    } catch (NumberFormatException e) {
      System.out.println("프로그램 아규먼트는 숫자여야 합니다,.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("안녕!");
  }   
}


