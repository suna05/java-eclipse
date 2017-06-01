/*File 다루기 - File 클래스 사용법*/
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_1 {

  public static void main(String[] args) throws Exception {
    File f = new File("./build.gradle");
    
    
    System.out.printf("getAbsolutePath()= %s\n", f.getAbsolutePath());
    
    System.out.printf("getCanonicalPath()= %s\n", f.getCanonicalPath());

    
    //getFreeSpace()
    //=> File의 경로가 가리키는 디스크의 여유공간을 바이트 단위로 리턴한다.
    System.out.printf("getTotalSpace() = %d\n",  f.getTotalSpace());
    
    System.out.printf("getFreeSpace() = %d\n", f.getFreeSpace());
    
    System.out.printf("getUsableSpace() = %d\n", f.getUsableSpace());
    
    System.out.printf("getName() = %s\n",f.getName());
    
    System.out.printf("getPath() = %s\n",f.getPath());
    
    System.out.printf("exists() = %s\n",f.exists());
    
    System.out.printf("isDirectory() = %b\n",f.isDirectory());
    
    System.out.printf("isFile() = %b\n",f.isFile());
    
    System.out.printf("length() = %d\n",f.length());
    
    //lastModified()
    //=>파일의 마지막 변경일을 밀리초로 리턴한다.
    System.out.printf("lastModified() = %d\n",f.lastModified());

    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(f.lastModified());
    System.out.printf("%d-%d-%d %s %d:%d:%d\n",
        cal.get(Calendar.YEAR), 
        cal.get(Calendar.MONTH) + 1,
        cal.get(Calendar.DAY_OF_MONTH),
        (cal.get(Calendar.AM_PM) == Calendar.AM) ? "AM" : "PM",
        cal.get(Calendar.HOUR),
        cal.get(Calendar.MINUTE),
        cal.get(Calendar.SECOND));
    
    
  }

}
