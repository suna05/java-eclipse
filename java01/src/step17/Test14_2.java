/*5월 22일
 * 예외 처리:  자원 자동 해제 try~catch~ 블록(try~with~resources 문장)
 *  */
package step17;

import java.io.FileInputStream;

public class Test14_2 {
  
  public static void main(String[] args) {
    try ( FileInputStream in = new FileInputStream("step17.Test14.data")) {
       int b = 0;
      while((b = in.read()) != -1) {
        System.out.printf("%x , ", b);
      }
    } catch (Exception e) {
    System.out.println(e.getMessage());
      
    } /*finally {
    
      }*/
      System.out.println("안녕");      
    }
    
  }   



