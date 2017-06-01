/*File 다루기 - File 클래스 사용법 3*/
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_4 {

  public static void main(String[] args) throws Exception {
    File f = new File("../../");
    
    //지정된 폴더에 
    File[] files = f.listFiles();
    
    for(File file : files) {
      System.out.printf("%s %12d %s\n",
          (file.isDirectory() ? "d" : "-"),
          file.length(),
              file.getName());
    }
  }

}
