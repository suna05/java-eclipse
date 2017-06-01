package hw;

import java.io.File;

public class BIT_del {
  public static void main(String args[]) throws Exception {
    String str = new String(args[0]);
    File f2 = new File(args[1]);
    
    if (str.equals("-R")) {
       DeleteFile(f2, 0); 
    } else {
      System.out.println("해당되는 파일이 없습니다.");
    }    
   
  }
    
    public static void DeleteFile(File dir, int level) throws Exception {
      File[] files = dir.listFiles();
      
      for(File file : files) {
        if (file.isFile() &&  file.getName().endsWith(".jpg")) {
            file.delete();
        }
        if (file.isDirectory())
          //file.delete();
          DeleteFile(file, level +1);
      }
    }
    
}