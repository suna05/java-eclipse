/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - BufferedInputStream 도입 후 1
 * */
package step16;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test04_3_in {
  
  static class MyBufferedInputStream{
    InputStream in;
    byte[] buf = new byte[8192];
    int len = 0;
    int cursor;
    
    MyBufferedInputStream(InputStream in) {
      this.in = in;
    }
    public int read() throws IOException {
      if (cursor == len) { //커서가 len과 같다는 것은 버퍼를 다 읽었다는 의미
        cursor = 0;
        len = in.read(buf);
        if (len < 0)
          return -1; //파일을 다 읽었다면 -1을 리턴하여 호출자에게 알려준다.
      }
       return buf[cursor++] & 0x000000FF;
    }
    
    public void close() {}
    
  }
  
  public static void main(String[] args) throws Exception {
  
    FileInputStream in0  =new FileInputStream("temp/jls8.pdf");
    MyBufferedInputStream in = new MyBufferedInputStream(in0);
    
   int b = 0;
   int count = 0;
  
    long start = System.currentTimeMillis(); //시작 시간

    while((b = in.read()) != -1) {  //-1이 아니면 계속 반복, 더 이상 리턴 값이 없을 시에 -1
   
      if ((++count % 10000) == 0)   System.out.print(".");
      if ((count % 500000) == 0 ) System.out.println();
    
    }
   long end = System.currentTimeMillis(); //끝나는 시간
   System.out.printf("\n걸린 시간 = %d", end-start);
    
    in.close();
    in0.close();
  }
}

