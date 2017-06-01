/*웹 서버 만들기
 * 1) 기본 클래스 골격 준비
 * 2) 클라이언트 연결을 받기
 * */
package step23.ex3;

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
      //클라이언트가 연결되면 소켓 리턴
      Socket socket = serverSocket.accept();
      System.out.println("클라이언트가 연결되었습니다."); //파비콘 달라고 2번 요청
    }    
  }
  
   public static void main(String[] args) throws Exception { //JVM에 Exception 던지는 순간 멈춤
    HttpServer server = new HttpServer(8888);
    server.listen();    
  }
}
