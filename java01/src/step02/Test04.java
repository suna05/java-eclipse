/*변수 선언: 문자 변수*/
package step02;

public class Test04 {

  public static void main(String[] args) {
      char c; //2 바이트 크기의 메모리. 정수 값을 저장.
                //short: -32768 ~ 32767
                //char: 0~65535
      
      short s;
      
      s = -32768;
      s = 32767;
      //s = 65535; //컴파일 오류
      
      //char 메모리는 유니코드 값을 저장하는 용도.
      // 그래서 유니코드 0~ 65535까지 값을 저장할 수 있게 되어 있음.
      c = 0;
      c = 65535;
      //c = -1; //컴파일 오류
      
      //보통 개발자가 유니코드 값을 직접 변수에 저장할 일은 거의 드물다.
      c = 44032;
      System.out.println(c);
      
      //일반적으로 문자의 유니코드 값을 저장할 때 작은 따옴표('')를 사용.
      c = '가'; //문자 '가'를 저장하는 것이 아님.
      //의미? '가'문자의 유니코드 값을 저장하는 것임.
      System.out.println(c);
      
      
      int i1 = '\b';
      System.out.println(i1);
      int i2 = '\t';
      System.out.println(i2);
      int i3 = '\n';
      System.out.println(i3);
      int i4 = '\f';
      System.out.println(i4);
      int i5 = '\r';
      System.out.println(i5);
      int i6 = '\'';
      System.out.println(i6);
      int i7 = '\"';
      System.out.println(i7);
      int i8 = '\\';
      System.out.println(i8);
      
      //16진수로 출력  8, 9, a, b, c, 27, 22, 5c
      System.out.printf("%x, %x,%x,%x,%x,%x,%x,%x", i1, i2, i3, i4, i5, i6, i7, i8);
      
      
  }
}
