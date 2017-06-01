/*File 다루기 - File 클래스 사용법 3*/
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_3 {

  public static void main(String[] args) throws Exception {
    File f = new File("../../");
    
    //지정된 폴더에 
    String[] files = f.list();
    
    for(String name : files) {
      System.out.println(name);
    }
  }

}
