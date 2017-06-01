/*소켓 프로그래밍 : 여러 클라이언트의 요청을 처리하기(서버)
 *=> 여러 클라이언트 요청을 병행으로 처리한다.
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test03_2 {
  
  //클라이언트 요청을 처리할 작업자 정의
  static class MyThread extends Thread {
    Socket socket;
    
    public MyThread(Socket socket) {
      this.socket = socket;
    }
    
    //"main"작업자와 동등한 관계에서 병행으로 수행할 작업 정의
    public void run() {
      try ( 
            InputStream in0 = socket.getInputStream(); 
            OutputStream out0 = socket.getOutputStream(); 
            Scanner in = new Scanner(in0); 
            PrintStream out = new PrintStream(out0); ) {
        
            System.out.println("=> 클라이언트 연결 승인!");
            String str = in.nextLine();  
            out.println(str); 
           } catch (Exception e) {
             //무시
           }
    }
  }
  
  public static void main(String[] args) throws Exception{
    System.out.println("서버 실행 중..");
   
    
    ServerSocket serverSocket  = new ServerSocket(8888);
    System.out.println("=> 서버 소켓 생성 완료");
    
   
    while(true) {
      //대기열에서 한 개의 클라이언트
      //반복문이 돌면서 클라이언트가 접속할 때까지 기다렸다가 접속하고나서
      //accept를 return 함. (그냥 계속 반복하는게 아니라)
      MyThread t = new MyThread(serverSocket.accept());
      
      //작업자에게 일을 시킴
      t.start(); //일을 시킨 후 즉시 리턴
    }
        
  }
}
