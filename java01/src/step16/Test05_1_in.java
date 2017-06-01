/*5월 22일
 * 데이터 프로세싱 스트림 클래스 - ObjectInputStream 도입 전
 *  * */
package step16;

import java.io.FileInputStream;

public class Test05_1_in {
  public static void main(String[] args) throws Exception {
    
    FileInputStream in0  =new FileInputStream("temp/Test05_1.data");
    java.io.DataInputStream in = new java.io.DataInputStream(in0);
 
    
    Student s = new Student();
    
    s.name = in.readUTF();
    s.kor = in.readInt();
    s.eng = in.readInt();
    s.math = in.readInt();
    s.sum = in.readInt();
    s.aver = in.readFloat();
    s.working = in.readBoolean();
    
    in.close();
    in0.close();
    
    System.out.println(s);
  }
}

