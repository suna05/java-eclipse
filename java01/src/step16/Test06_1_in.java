/*5월 22일
 * character stream 클래스: FileWiterer VS FIleInputStream
 *  * */
package step16;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test06_1_in {
  public static void main(String[] args) throws Exception {
    
    FileInputStream in  =new FileInputStream("test06_1.txt");
    
    int b = 0;
    
    //바이트(바이너리)스트림 클래스는 바이트 단위로 그대로 데이터를 읽고 쓴다.
    while ((b = in.read()) != -1 ) {
      System.out.printf("%x,  ", b);
    }    
    System.out.println();
 
    
    in.close();
    
    
    System.out.println("----------------------------------------");
    FileReader in2  =new FileReader("test06_1.txt");
    
    //int b = 0;
    
    //캐릭터 스트림 클래스는 문자 단위로 데이터를 읽고 쓴다.
    //1) 읽을 때
    //=> 문자의 인코딩 방식에 따라 1~4 바이트를 읽어서
    //     자바에서 사용하는 2 byte유니코드 값으로 변환한다.
    
    //2) 쓸 때
    //=> 문자의 인코딩 방식에 따라 2byte유니코드 값을
    //     
    while ((b = in2.read()) != -1 ) {
      System.out.printf("%x,  ", b);
    }    
    System.out.println();
 
    
    in.close();
    
  
  }
}

