package hw;

import java.io.File;

public class BIT_ls {
  public static void main(String[] args) throws Exception {
    File f = new File("./src/hw");
    
    File[] files = f.listFiles();
    
    for (File file : files) {
      System.out.printf("폴더명: %s 파일이름:%s 크기: %3d\n", 
          (file.isDirectory() ? "d" : "-"),
          file.getName(),
          file.length());
    }
  }
}



      
      


    
