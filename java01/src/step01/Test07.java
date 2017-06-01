/*리터럴 - 부동 소수점과 유효자릿수*/
package step01;

public class Test07 {
  public static float xxx= 12.375f;
  
  public static void main(String[] args) {
   //1) 4바이트 메모리 = single precision(단정도:  한개의 정밀도)
    System.out.println(987.654f);
    System.out.println(987.6549f);  //보통 7자리까지 유효하다.
    System.out.println(9.876549f);  //보통 7자리까지 유효하다.
    System.out.println(987654.9f);  //보통 7자리까지 유효하다.
    System.out.println(987.65498f); //유효자리수를 넘어가면 값이 짤린다.
                                                //<주의> 컴파일 오류가 발생하지 않는다.
    
    //2) 8바이트 메모리 = double precision(배정도: 단정도 보다 두 배 정밀하다)
    System.out.println(99999.9999999999);
    System.out.println(9.99999999999999); //15자리. 실무에서는 15자리를 유효자리로 본다.
    System.out.println(99999999999999.9);  //E13 (똑같은 말)
    System.out.println(999999.999999999);
    System.out.println(999999.99999999999); //17자리(잘리거나 반올림 처리된다.)
  }
}
