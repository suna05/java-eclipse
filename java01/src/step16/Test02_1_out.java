/*File I/O - 바이트 스트림 클래스- FileOutputStream
 *=> 
 * */
package step16;

import java.io.FileOutputStream;

public class Test02_1_out {

  public static void main(String[] args) throws Exception {
    //1)FileOutputStream 객체 생성
    FileOutputStream out  =new FileOutputStream("test02_1.data");
    
    //write(Int) => 무조건 끝 1바이트만 출력
    out.write(0x66778899);
    out.write(0x77665544);
    out.write(0x12345678);
    
    //출력 스트림을 다 사용했으면 파일을 닫아라.
    //=> 파일을 다루기 위해 준비했던 메모리를 해제시킨다.
    //=> OS파일 시스템과의 연결도 끊는다.
    out.close();
   
  }
}

