/*File I/O - 바이트 스트림 클래스- DataOutputStream
 *=> 
 * */
package step16;

import java.io.FileOutputStream;

public class Test02_6_out {

  public static void main(String[] args) throws Exception {
  
   FileOutputStream out0  =new FileOutputStream("test02_6.data");
   DataOutputStream out = new DataOutputStream(out0);
   
    byte b = 0x11;
    out.writeByte(b);
    
    short s = 0x2233;
    out.writeShorts(s);
    
    int i = 0x44556677;
    out.writeInt(i);
    
    String str = "ABC가각간";
    out.writeUTF(str);
  
    
    //출력 스트림을 다 사용했으면 파일을 닫아라.
    //=> 파일을 다루기 위해 준비했던 메모리를 해제시킨다.
    //=> OS파일 시스템과의 연결도 끊는다.
    out.close();
    
    System.out.println("파일 출력 완료!");
   
  }
}

