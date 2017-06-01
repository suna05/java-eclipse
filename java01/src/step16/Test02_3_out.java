/*File I/O - 바이트 스트림 클래스- FileOutputStream 3
 *=> 바이트 배열의 일부만 출력하기
 * */
package step16;

import java.io.FileOutputStream;

public class Test02_3_out {

  public static void main(String[] args) throws Exception {
  
    FileOutputStream out  =new FileOutputStream("test02_4.data");
    
    byte[] bytes = {0x11, 0x22, 0x33, 0x44, 0x55, 0x66, 0x77};
    out.write(bytes, 2, 3); //바이트 배열에서 2번 방부터 3개 출력

    
    //출력 스트림을 다 사용했으면 파일을 닫아라.
    //=> 파일을 다루기 위해 준비했던 메모리를 해제시킨다.
    //=> OS파일 시스템과의 연결도 끊는다.
    out.close();
    
    System.out.println("파일 출력 완료!");
   
  }
}

