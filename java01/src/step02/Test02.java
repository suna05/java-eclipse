/*변수 선언: 정수 변수*/
package step02;

public class Test02 {

  public static void main(String[] args) {
    byte b; //1byte 크기의 메모리
    short s; //2byte //
    int i; //4 //
    long l; //8 //
    
    b = -128; // = Byte.MIN_VALUE :Byte 클래스 블록 안에 선언된 MIN_VALUE 라는 변수
    b = 127; // = Byte.MAX_VALUE
    //b = -129; //1바이트 크기를 넘기 때문에 컴파일 오류!
    //b = -128;  //1바이트를 넘기 때문에 컴파일 오류!
 
    s = -32768; // = Short.MIN_VALUE
    s = 32767;
    //s = -32769; //2바이트 크기를 넘는 값이기 때문에 컴파일 오류!
    //s = 32768; //2바이트 크기를 넘는 값이기 때문에 컴파일 오류!
    
    i = -21_4748_3648; // Integer.MIN_VALUE
    i = -21_4748_3647;
    //i = -21_4748_3649L; //4바이트 메모리 크기를 넘는 값을 담을 수 없다. 오류!
    //i = -21_4748_3648L; //4바이트 메모리 크기를 넘는 값을 담을 수 없다. 오류!
    //i = 100L; //100L은 8바이트 정수 값을 의미한다. 
    //8바이트 값을 4바이트 메모리에 담으려고 하면 오류!
    
    l = Long.MIN_VALUE;
    l = Long.MAX_VALUE;
    l = Long.MIN_VALUE - 1; // 변수의 값을 컴파일러가 모르기 때문에 
                                        //컴파일 단계에서는 오류가 발생하지 않는다.
    //하지만 실행할 때 오류가 발생.
    //실행할 때 발생하는 오류: Runtime Exception 이라고 부른다.
    l = Long.MAX_VALUE + 1;
       
  }
}
