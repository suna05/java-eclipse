/*리터럴 - 정수 리터럴 표현*/
package step01;

public class Test04 {
  public static void main(String[] args) {
    System.out.println(21_4748_3647); //4바이트 양의 정수 최대 값. 32비트-1
    System.out.println(-2147483648); //4바이트 음의 정수 최대 값
    System.out.println(9223372036854775807L); //8바이트 양의 정수 최대 값
    System.out.println(-9223372036854775808L);
  }
}
