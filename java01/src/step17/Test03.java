/*예외 처리: 조건문을 사용하여 예외처리를 하는 경우 */
package step17;

public class Test03 {
  //메서드를 실행하다가 예외를 던질 수 있는 경우
  //=> 메서드 선언부에 어떤 예외가 던져질 수 있는지 적어야 한다.
  public static float divide(float a, float b) throws Throwable {
    if ( b == 0) {
      //예외 상황이 발생하면 호출자에게 그 정보를 전달해야 한다.
      throw new Throwable("0으로 나누지 마세요");
    }
    return a / b;
  }

  public static void main(String[] args) {
    try {
      float result = divide(10, 2);    
      System.out.println(result);
      result = divide(10, 0);
      System.out.println(result);
    } catch (Throwable ex) {
      System.out.println(ex.getMessage());
    }
      
    }
    
    
  }


