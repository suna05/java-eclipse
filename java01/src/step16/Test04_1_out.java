/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - BufferedOutputStream 도입 전 1
 * */
package step16;

import java.io.FileOutputStream;

public class Test04_1_out {
  public static void main(String[] args) throws Exception {
    
    FileOutputStream out  =new FileOutputStream("temp/test04_1.data");
            
    long start = System.currentTimeMillis(); //시작 시간

    
    for (int i = 1 ; i < 4000000; i++) {
      out.write(i);
      if (( i % 10000) ==0) System.out.print(".");
      if ((i % 500000) == 0) System.out.println();
    }
   long end = System.currentTimeMillis(); //끝나는 시간
   System.out.printf("\n걸린 시간 = %d", end-start);
    
    out.close();
  }
}

