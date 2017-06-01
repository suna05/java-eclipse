/*File 다루기 - File 클래스 사용법 6
 * 특정 확장자를 가진 파일만 출력하기
 * */
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_6 {

  public static void main(String[] args) throws Exception {
    File f = new File("../../");
    
    displayDirectory(f, 0);
  }

  public static void displayDirectory(File dir, int level) throws Exception {
    File[] files = dir.listFiles();
    
    
    for(File file : files) {
      if (file.isFile() &&  file.getName().endsWith(".class")) {
          System.out.printf("%s\n", file.getPath());
      }
      if (file.isDirectory())
        displayDirectory(file, level +1);
    }
    
  }
  
}
