/*리터럴 - 부동 소수점 리터럴*/
package step01;

public class Test06 {
  public static float xxx= 12.375f;
  
  public static void main(String[] args) {
   //1) 4바이트 고정 소수점 리터럴
    System.out.println(3.14F);
    System.out.println(3.14f); //소문자 f를 더 많이 사용
    
    //2) 8바이트 고정 소수점 리터럴
    System.out.println(3.14D);
    System.out.println(3.14d);
    System.out.println(3.14); //안 붙이는 방식을 더 많이 사용
   
  }
}
