/*File I/O - 바이트 스트림 클래스- FileInputStream4
 *=> 바이트 배열을 읽은 후 저장할 위치를 지정하기
 *     
 * */
package step16;

import java.io.FileInputStream;


public class Test02_4_in {

  //private static byte[] bytes;

  public static void main(String[] args) throws Exception {
    //1)FileOutputStream 객체 생성
    FileInputStream in  =new FileInputStream("test02_4.data");
    
    byte b;
    short s;
    int i;

    
    b = (byte) in.read(); 
    s = (short) (in.read()<<8); 
    s |= (short) (in.read()); 
    
    
   
   i = (int) (in.read()<<24); 
   i |= (int) (in.read()<<16);
   i |= (int) (in.read()<<8);
   i |= (int) (in.read()); 
   
   int len; //문자열 바이트를 읽기 전에
               //몇 바이트를 읽어야 하는지 그 크기를 먼저 읽는다.
   len = (int) (in.read()<<24);
   len |= (int) (in.read()<<16);
   len |= (int) (in.read()<<8);
   len |= (int) (in.read()); 
   //문자열 배열의 크기만큼 바이트 배열을 만든다.
   byte[] buf = new byte[len];
   
   //문자열 배열을 읽어 바이트 배열에 저장한다.
   in.read(buf);
   
   //바이트 배열에 들어 있는 값을 가지고 문자열 객체를 생성한다.
   //=> 
  String str = new String(buf, "UTF-8");
    
    System.out.printf("%x, %x , %x, %s\n", b,s,i,str);
    
    in.close();
   
  }
}

