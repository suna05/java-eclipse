/*변수 선언 - 정수 리터럴 표현*/
package step01;

public class Test03 {
  public static void main(String[] args) {
    //1)그냥 숫자를 작성하는 것은 4바이트 크기의 정수 값을 의미
    System.out.println(-10);
    System.out.println(10);
    System.out.println(2147483647); //4바이트 양의 정수 최대 값. 32비트-1
    System.out.println(-2147483648); //4바이트 음의 정수 최대 값
    
    //2) 8바이트 정수 값을 표현할 때는 숫자 뒤에 'L', 'l'을 붙인다.
    System.out.println(-10L);  //대문자 L을 붙여도 되고
    System.out.println(10L); //소문자 l을 붙여도 된다. 
                                     //그런데 숫자 1과 소문자 l 구분이 어려워 대부분 대문자 사용
    System.out.println(2147483648L);  //4바이트 양의 정수 최대 값을 넘어도 괜찮다.
    System.out.println(-2147483649L); //4바이트 음의 정수 최대 값을 넘어도 괜찮다.
    
    System.out.println(9223372036854775807L); //8바이트 양의 정수 최대 값
    System.out.println(-9223372036854775808L);
  }
}
