/*변수 선언: 부동 소수점 변수*/
package step02;

public class Test03 {

  public static void main(String[] args) {
    float f; 
    double d; 
    
    f = 9.999999f; //유효자릿수 7자리
    System.out.println(f);
    
    f = 999999.9f; //유효자릿수 7자리
    System.out.println(f);
    
    f = 9.9999997f; //유효자릿수 7자리를 넘김 => 반올림 or 값이 잘림
    //그래서 유효자릿수를 넘기지 않은 수를 저장해야 올바른 값을 꺼낼 수 있다.
    // 즉 컴파일 할 때 오류가 나지 않는다고 안심해서는 안됨.
    // 반드시 유효자릿수를 지켜야 한다.
    System.out.println(f);
    
    f = 9.14159234567f;
    System.out.println(f);
    
    f = 3.14159234567f; //3과 9일 때 출력값이 다르므로 8자리를 사용하면 신뢰도가 낮음
    System.out.println(f);
    
    d = 3.14159234567f; // 3.14159234567 값을 float으로 표현할 때 이미 값이 잘림.
    //그래서 d변수에 들어갈 때는 이미 잘린 값이 들어감.
    System.out.println(d);
    
    d = 3.14159234567; // 부동 소수점을 배정도 값으로 표현하고 싶다면 f(F)를 붙이지 말아라.
    //그래서 8바이트 배정도 부동 소수점으로 표현된다.
    System.out.println(d); //제대로 된 값이 출력됨       
  }
}
