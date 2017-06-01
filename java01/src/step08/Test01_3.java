/*프로그램 아규먼트 연습2
 * => 가위바위보
 * => 예)
 *        > java -cp bin step08.Test01_3 가위
 *           당신이 이김
 *           당신이 짐
 *           비김        
 *           
 * => Math.rendom() 의 리턴값은 
 *      0 <= x <1
 *      x는 부동소수점이다.
 *      
 * => 세 가지 임의의 상태 값을 얻는 방법
 *       Math.random() * 3 = 0<= x <3
 *       x는 부동소수점이다.
 *  => 소수점 이하를 날리는 방법 : 명시적 형변환을 사용하라
 *        float f = 3.14f;
 *        int r = (int)f;
 * */
package step08;

public class Test01_3 {

  public static void main(String[] args) {
   // if(args.length < 3) {
      //System.out.println("[사용법]");
      //System.out.println(">java -cp bin step08.Test01_3 1");
    //System.out.println("가능한 입력:")
      //return;
    //}
       
    int input = Integer.parseInt(args[0]);
    int robot = (int)(Math.random() * 3) + 1;
    boolean victory = false;
    
    if (input == robot) {
      System.out.println("비겼습니다.");
    } else if (input ==1 && robot == 3 ) {
      victory = true;
     } else if (input == 2 && robot == 1) {
        victory = true;
      }
    }
    
    printResult(victory);  
  }
  
  
    public static void printResult(int a, int b, String op, int result) {
      if (victory) {
        System.out.println("이김");
      } else {
        System.out.println("짐");
      }
 
    
   if (args.length<1 ) {
      System.out.println(Math.random());
    }
   

  }
  }
