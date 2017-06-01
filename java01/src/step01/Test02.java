/*리터럴 - 기본 데이터 타입의 리터럴 표현*/
package step01;

public class Test02 {

  public static void main(String[] args) {
   //기본 데이터 타임
   
    //1) 정수 데이터 형
    System.out.println('가'); //문자 값. 2바이트 크기
   System.out.println(100);// 정수. 4바이트 크기의 정수
   System.out.println(100L); //정수. 8바이트
   
   //2)부동 소수점 데이터 형
   System.out.println(3.14f); //부동 소수점 값. 4바이트 크기
   System.out.println(3.14); //부동 소수점 값. 8바이트 크기 
   
   //3)논리 데이터 형
   System.out.println(true); //논리 값. 4바이트 크기

   //4) 객체 데이터 형
   System.out.println("문자열"); //문자열
   //System.out.println('문자열'); //자바에서는 ''은 한개의 문자만 표현할 수 있다.
  }
}
