package hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BIT_cp {
  public static void main(String[] args) throws Exception {
    File f1 = new File(args[0]);
    File f2 = new File(args[1]);
      
    byte[] buf = new byte[1024];
    
    FileInputStream in  =new FileInputStream(f1);
    FileOutputStream out  =new FileOutputStream(f2);
    int len = 0;


    try {
        if(f1.exists()) {      
          f2.createNewFile();
          while((len = in.read(buf)) != -1) {
              out.write(buf, 0, len);
            }
          System.out.printf("%s 파일이 생성되었습니다.", args[1]);
        } else {
          System.out.printf("%s 파일이 존재하지 않습니다.", args[0]);
        }
    } catch (Exception e) {
      
    } finally {
        in.close();
        out.close();
    }
    }
  }




      
      


    
