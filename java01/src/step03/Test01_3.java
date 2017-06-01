/*산술연산자(+,-,*,/,%)  - 명시적 형변환
 * */

package step03;

public class Test01_3 {

  public static void main(String[] args) {
  
    int a = 5;
    int b = 2;
    float f = a/b;

    System.out.println(f);
    
    //명시적 형변환을 이용하여 계산
    float f1 = a /  b;
    System.out.println(f1);
    
    float f3 = (float)a / b;
    System.out.println(f3);
}}

