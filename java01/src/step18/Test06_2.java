/*5/24  소켓프로그래밍:  Echo 클라이언트 만들기 
 * 
 * */
package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;



public class Test06_2 {
  public static void main(String[] args) throws Exception{
   
    if(args.length < 3) {
      System.out.println("[사용법] > java -cp bin step18.Test06_2 서버 포트 메시지");  //메세지
      return;
    }
    
   
    try (  //()안에 놓여진 클래스는 auto
    
    Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
    Scanner in = new Scanner(socket.getInputStream()); //바이트스트림을 캐릭터스트림에 연결할 수 있음
    PrintStream out = new PrintStream(socket.getOutputStream());
  ) {
      out.println(args[2]);
      System.out.println(in.nextLine());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
       
  } 
}    
  

