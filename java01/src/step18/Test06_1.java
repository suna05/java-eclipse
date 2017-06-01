/*5/24  소켓프로그래밍:  Echo 서버 만들기 
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


public class Test06_1 {
  static class EchoThread extends Thread {
    Socket socket;
    
    public EchoThread(Socket socket) {
      this.socket = socket;
      
    }
    
    public void run() {
      try ( //try안에 변수를 선언하면 java.lang.auto
          Socket socket = this.socket; //트라이 캐치 나가면서 자동으로 close()됨
          Scanner in = new Scanner(socket.getInputStream());
          PrintStream out = new PrintStream(socket.getOutputStream());
         ) {
          String message = in.nextLine();
          out.println("[suna]" + message);
      } catch (Exception e) {}
    }
  }
  
  public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중.....");
    
    while (true) {
      new EchoThread(serverSocket.accept()).start(); //serverSocket.accept()가 클라이언트와 연결되면
                                                                //먼저 만들어지고 accept에서 값을 리턴하면
                                                                //EchoThread에서 생성자 호출
    }                                                           //.start() 쓰레드 객체에 대해서 start하는 거임
   
  } 
}    
  

