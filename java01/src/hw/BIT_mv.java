package hw;

import java.io.File;

public class BIT_mv {
  public static void main(String[] args) {
    File f1 = new File(args[0]);
    File f2 = new File(args[1]);
 
    f1.renameTo(f2);
    System.out.printf("%s -> %s 파일로 이름이 변경되었습니다.", args[0], args[1]);

    }
  }




      
      


    
