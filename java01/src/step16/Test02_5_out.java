/*File I/O - 바이트 스트림 클래스- MyDateOutputStream
 *=> FileOutputStream을 상속 받아서 다양한 타입의 값을출력하는 기능을 추가한다.
 *
 * */
package step16;

import java.io.FileOutputStream;

public class Test02_5_out {

  public static void main(String[] args) throws Exception {
  
    MyDataOutputStream out  =new MyDataOutputStream("test02_5.data");
    
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

