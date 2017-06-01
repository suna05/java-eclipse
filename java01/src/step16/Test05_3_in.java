/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - 직렬화와 transient변경자
 * => transient로 선언된 인스턴스 변수의 값은 파일에 저장되지 않기 때문에 읽을 수 없다.
 *    이 경우 데이터를 읽은 다음에 메서드를 통해 그 인스턴스 변수의 값을 설정해야 한다.
 *  * */
package step16;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test05_3_in {
  public static void main(String[] args) throws Exception {
    
    FileInputStream in0  =new FileInputStream("temp/Test05_3.data");
    ObjectInputStream in = new ObjectInputStream(in0);
 
    Student3 s = (Student3)in.readObject();
    

    
    in.close();
    in0.close();
    
    System.out.println(s);
    //직렬화된 데이터를 읽어들인 후에 계산을 수행한다.
    s.compute();
    //그러면 transient로 설정된 변수의 값이 계산될것이다.
    System.out.println(s);
  }
}

