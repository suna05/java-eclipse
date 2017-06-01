/*File I/O - 바이트 스트림 클래스- MyDataInputStream
 *=> FileInputStream을 상속받아 다양한 타입의 데이터를 읽을 수 있는 기능추가
 *     
 * */
package step16;

import java.io.FileInputStream;


public class Test02_5_in {

  //private static byte[] bytes;

  public static void main(String[] args) throws Exception {   
    MyDataInputStream in  =new MyDataInputStream("test02_5.data");    
    
    byte b = in.readByte(); 
    
    short s = in.readShort(); 
    
    int i = in.readInt();
    
    String str =  in.readUTF();     
       
    System.out.printf("%x, %x , %x, %s\n", b,s,i,str);
    
    in.close();
   
  }
}

