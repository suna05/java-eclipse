/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 전  2
 * */
package step16;

import java.io.FileInputStream;

public class Test04_2_in {
  public static void main(String[] args) throws Exception {
    //1)FileOutputStream 객체 생성
    FileInputStream in  =new FileInputStream("temp/jls8.pdf");
    
    byte[] buf = new byte[8196]; //(기본)8KB = 1KB(1024byte) * 8  //최대 8196byte를 읽어라 
    //byte[] buf = new byte[8196000];  8M => 혼자 속도 내겠다고 8m를 차지하면 
    //다른 프로그램과 함께 동시에 실행되면(1000명이 요청할 경우) 8m*1000 = 8000m = 8G , 
    //컴퓨터 메모리가 4G라서 메모리가 부족하게 됨, 속도를 높이는 것이 중요한 것이 아님
    
    int len = 0;
    
    int countPoint = 0;
    
    long start = System.currentTimeMillis(); //시작 시간

    while((len = in.read(buf)) != -1) {  //-1이 아니면 계속 반복, 더 이상 리턴 값이 없을 시에 -1
   
      System.out.print(".");
        if ((++countPoint % 50) == 0 ) {
          System.out.println();
      }
    }
   long end = System.currentTimeMillis(); //끝나는 시간
   System.out.printf("\n걸린 시간 = %d", end-start);
    
    in.close();
  }
}

