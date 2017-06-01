/*File I/O - 바이트 스트림 클래스- FileOutputStream 4
 *=> 다양한 타입의 값을 출력하기
 * */
package step16;

import java.io.FileOutputStream;

public class Test02_4_out {

  public static void main(String[] args) throws Exception {
  
    FileOutputStream out  =new FileOutputStream("test02_4.data");
    
    byte b = 0x11;
    out.write(b);
    
    short s = 0x2233;
    out.write(s >> 8);
    out.write(s);
    
    int i = 0x44556677;
    out.write(i >> 24);
    out.write(i >> 16);
    out.write(i >> 8);
    out.write(i);
    
    
    String str = "ABC가각간";
    byte[] bytes = str.getBytes("UTF-8");
    
    int len = bytes.length;
    out.write(len >> 24);
    out.write(len >> 16);
    out.write(len >> 8);
    out.write(len);
    
    //문자열의 바이트 출력
    out.write(bytes);
 
    
    
    //출력 스트림을 다 사용했으면 파일을 닫아라.
    //=> 파일을 다루기 위해 준비했던 메모리를 해제시킨다.
    //=> OS파일 시스템과의 연결도 끊는다.
    out.close();
    
    System.out.println("파일 출력 완료!");
   
  }
}

