/*예외 처리: 사용자 정의 예외 던지기
 * => 자바에서 마땅한 예외 클래스가 없을 경우 
 *      개발자가 직접 예외 클래스를 만들어 던질 수 있다.
 * => 애플리케이션 예외이어야 하기 때문에
 *       java.lang.Exception을 상속 받아서 만든다.
 * => 예외 처리할 때 기능에 따라 예외 클래스를 선택하는 것이 아니라,
 *       보통 그 상황에 적합한 
*  */
package step17;

public class Test07 {
  static class InvalidValueScopeException extends IllegalArgumentException{

    public InvalidValueScopeException() {
      super();
    }

    public InvalidValueScopeException(String message, Throwable cause) {
      super(message, cause);
    }

    public InvalidValueScopeException(String s) {
      super(s);   
    }

    public InvalidValueScopeException(Throwable cause) {
      super(cause);
    }
      
  }
  public static void main(String[] args) {
  
    try {
      if (args.length < 1) 
        throw new IllegalArgumentException("애플리케이션 아규먼트가 없습니다.");
      
      int age = Integer.parseInt(args[0]);
          
      if (age < 1)
        throw new InvalidValueScopeException("나이가 유효하지 않습니다.");
    
      System.out.println(age);
        
    } catch (Throwable ex) {
      ex.printStackTrace();        
    }
  }   
}


