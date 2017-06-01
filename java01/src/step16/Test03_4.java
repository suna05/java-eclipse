/*File I/O - 바이트 스트림 클래스- DataArrayOutputStream/DataArrayInputStream
 *=> 
 * */
package step16;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;


public class Test03_4 {

  public static void main(String[] args) throws Exception {
    ByteArrayOutputStream out0 = new ByteArrayOutputStream();
    DataOutputStream out = new DataOutputStream(out0);
    
    byte b = 0x11;
    out.writeByte(b);
    
    short s = 0x2233;
    out.writeShorts(s);
    
    int i = 0x44556677;
    out.writeInt(i);
        
    String str = "ABC가각간";
    out.writeUTF(str);

    
    byte[] buf = out0.toByteArray();
    
    out.close();

  
    ByteArrayInputStream in0 = new ByteArrayInputStream(buf);
    DataInputStream in = new DataInputStream(in0);
    
    byte b2 =in.readByte();
    short s2 = in.readShort();    
    int i2 = in.readInt();  
   String str2 = in.readUTF();      
   in.close();
    
   System.out.printf("%x, %x, %x, %s\n", b2, s2, i2,str2);
  }
}

