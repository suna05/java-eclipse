/*File I/O - 바이트 스트림 클래스- MyArrayOutputStream/MyArrayInputStream
 *=> 
 * */
package step16;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;


public class Test03_3 {

  public static void main(String[] args) throws Exception {
    MyArrayOutputStream out = new MyArrayOutputStream();
    
    
    byte b = 0x11;
    out.writeByte(b);
    
    short s = 0x2233;
    out.writeShorts(s);
    
    int i = 0x44556677;
    out.writeInt(i);
        
    String str = "ABC가각간";
    out.writeUTF(str);

    
    byte[] buf = out.toByteArray();
    
    out.close();

  
    MyArrayInputStream in = new MyArrayInputStream(buf);
 
    byte b2 =in.readByte();
    short s2 = in.readShort();    
    int i2 = in.readInt();  
   String str2 = in.readUTF();      
   in.close();
    
   System.out.printf("%x, %x, %x, %s\n", b2, s2, i2,str2);
  }
}

