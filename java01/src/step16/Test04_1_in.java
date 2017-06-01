/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 전 1
 * */
package step16;

import java.io.FileInputStream;

public class Test04_1_in {
  public static void main(String[] args) throws Exception {
    //1)FileOutputStream 객체 생성
    FileInputStream in  =new FileInputStream("temp/jls8.pdf");
    
    int b = 0;
    int count = 0;
    int countPoint = 0;
    
    long start = System.currentTimeMillis(); //시작 시간

    while((b = in.read()) != -1) {  //-1이 아니면 계속 반복
      if (++count == 10000) {
        count = 0;
        System.out.print(".");
        if ((++countPoint % 50) == 0 ) {
          System.out.println();
        }
      }
    }
   long end = System.currentTimeMillis(); //끝나는 시간
   System.out.printf("\n걸린 시간 = %d", end-start);
    
    in.close();
  }
}

