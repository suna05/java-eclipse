/*웹 서버 만들기
 * 1) 기본 클래스 골격 준비
 * 2) 클라이언트 연결을 받기
 * 3) HTTP 요청 받고, HTTP 응답하기
 * */
package step23.ex4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
  int port;
    
  public HttpServer(int port) {
    this.port = port;
  }
  
  public void listen() throws Exception{
    ServerSocket serverSocket = new ServerSocket(this.port);
    System.out.println("서버 실행 중...");
    
    
    while(true) {
      try ( //java.lang.autocloseable에 속한 객체들
      //클라이언트가 연결되면 소켓 리턴
          //클라이언트는 한 줄 읽고 \n, \n 라인별로 요청, 마지막에 빈 엔터쓰고 내용 요청
      Socket socket = serverSocket.accept();
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));  ) {
      //바이너리라도 println의 기능이 들어있음 //버퍼쓰면 항상 쓸 때마다 flush()
        System.out.println("클라이언트가 연결되었습니다."); //파비콘 달라고 2번 요청
      }
      
    }    
  }
  
   public static void main(String[] args) throws Exception { //JVM에 Exception 던지는 순간 멈춤
    HttpServer server = new HttpServer(8888);
    server.listen();    
  }
}
