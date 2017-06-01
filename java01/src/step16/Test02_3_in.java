/*File I/O - 바이트 스트림 클래스- FileInputStream3
 *=> 바이트 배열을 읽은 후 저장할 위치를 지정하기
 *     
 * */
package step16;

import java.io.FileInputStream;


public class Test02_3_in {

  public static void main(String[] args) throws Exception {
    //1)FileOutputStream 객체 생성
    FileInputStream in  =new FileInputStream("test02_3.data");
    
    byte[] bytes = new byte[1024]; //힙 : 무조건 0으로 초기화
    int len = 0;
    
    // read(배열주소, offset, length)
    //=> 배열주소: 데이터를 저장할 배열
    //=> offset: 저장할 위치(index: 0부터 시작)
    //=> length: "희망"하는 읽을 바이트 수
    //=> 리턴 값: 실제 읽은 바이트 수
    len = in.read(bytes, 5 , 2); 
    
   
    for (int i = 0; i < 10; i++) {
      System.out.printf("%x ", bytes[i]);
    }
    
    in.close();
   
  }
}

