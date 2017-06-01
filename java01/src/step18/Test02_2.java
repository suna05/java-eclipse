/*소켓 프로그래밍 : 서버 소켓 대기열(클라이언트)
 *=> 
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test02_2 {
  public static void main(String[] args) throws Exception{
    
    Scanner keyScanner = new Scanner(System.in);
    
    
    //접속할 서버 주소 입력받기
    System.out.print("서버주소: ");
    String serverAddress = keyScanner.nextLine();
    
    //2)접속할 서버의 포트 번호 입력 받기
    System.out.print("포트 번호: ");
    int port = Integer.parseInt(keyScanner.nextLine());
    
    //3)    
    Socket socket  = new Socket(serverAddress, port);
    System.out.println("=> 소켓 객체 생성 완료");
    
    //4) 입출력할 스트링 객체 준비
 
    InputStream in0 = socket.getInputStream();
    OutputStream out0 = socket.getOutputStream();
    

    
    //5) 입출력 보조 객체 준비
    Scanner in = new Scanner(in0);
    PrintStream out = new PrintStream(out0);
    System.out.println("=> 입출력 스트림 준비 완료");
    
    // 6) 키보드에서 서버에 보낼 메시지를 입력받는다.
    System.out.print("서버에 보낼 메시지: ");
    String message = keyScanner.nextLine();
    
        
    //7) 키보드에서 입력 받은 메시지를 서버에 보낸다.
    out.println(message);
    System.out.println("=> 서버에 메시지 전송 완료");

    //8) 서버가 보낸 메시지를 읽는다.
    String response = in.nextLine();
    System.out.println("=> 서버로부터 메시지 수신 완료");
    
    //9) 서버가 보낸 메시지를 화면에 출력
    System.out.println(response);
    
    in.close();
    in0.close();
    out.close();
    out0.close();
    socket.close();
    keyScanner.close();
    
  }
}
