/*변수 선언: 자바의 원시 데이터 타입*/
package step02;

public class Test01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //자바의 최소 단위 메모리 => primitive data type(원시 타입) = ( 기본타입)
      //1) 정수 변수: 정수값을 저장할 때 사용하는 메모리
    byte b; //1byte 크기의 메모리
    short s; //2byte //
    int i; //4 //
    long l; //8 //
   
    //2) 부동 소수점 변수: 부동 소수점 값을 저장할 때 사용하는 메모리
    float f; //4 //
    double d; //8 //
    
    //3) 문자 변수: 문자의 유니코드 값을 저장할 때 사용하는 메모리
    char c; //2 //
    
    //4) 논리 값 변수: 논리 값을 저장할 때 사용하는 메모리
    boolean bool; //자바 언어 명세서에서 크기를 알려주지 않는다.
    //다만 JVM 명세서에서 int 메모리를 사용한다고 언급 함.
    //그리고 배열로 만들 때는 byte 메모리를 //.
    
    //5) 위 8개 원시 타입을 제외한 나머지는 모두 레퍼런스 변수이다.
    //레퍼런스 변수(=레퍼런스)? 메모리의 주소를 저장하는 변수.
    Object obj;
    String str;
    Thread thread;
       
  }
}
