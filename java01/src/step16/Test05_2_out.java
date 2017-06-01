/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - ObjectOutputStream 도입 후
 * => 객체 출력하기
 * => 직렬화
 * */
package step16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test05_2_out {
  public static void main(String[] args) throws Exception {
    //
    //
    //
    Student2 s = new Student2("홍길동", 100, 90, 80, false);
      
    FileOutputStream out0  =new FileOutputStream("temp/Test05_2.data");
    ObjectOutputStream out = new ObjectOutputStream(out0);
    
   //객체 출력
    //=> 인스턴스의 값들을 바이트 배열로 만들어 출력한다. "Serializable(직렬화)" 한다.
    //=> 단 해당 클래스에서 직렬화를 허락해야 한다.
    out.writeObject(s);
    
    out.close();
    out0.close();
  }
  
}

