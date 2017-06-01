/*리터럴 - 문자 리터럴*/
package step01;
public class Test10 {
  public static void main(String[] args) {
    
    char c1 = 44032; //'가'의 유니코드 값
    System.out.println(c1);
    //println()에 char 타입의 값을 주면 유니코드로 인식한다.
    //그래서 폰트 파일에서 해당 코드의 문자 그림을 찾아 화면에 뿌린다.
    
    
    char c2 = 0xAC00;  //'가'의 유니코드 값 
    System.out.println(c2);
    
    char c3 =  '헐'; //'헐'의 유니코드  값. '' 작은따옴표를 이용하면 문자의 유니코드 값을 알아낼 수 있다.
    System.out.println(c3);
    
    char c4 = '\uAC00'; //' 가'의 유니코드 값을 리턴한다
    System.out.println(c4);
  }
}
