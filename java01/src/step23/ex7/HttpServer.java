/*웹 애플리케이션 실행하기
 * 1) 클라이언트가 요구하는 자원의 경로를 알아내기
 * */
package step23.ex7;

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
      new HttpProcessor(serverSocket.accept()).start();
     }    
  }
  
   public static void main(String[] args) throws Exception { //JVM에 Exception 던지는 순간 멈춤
    HttpServer server = new HttpServer(8888);
    server.listen();    
  }
   
   class HttpProcessor extends Thread {
     Socket socket;
     
     public HttpProcessor (Socket socket) {
       this.socket = socket;
     }
     
     public void run() {
       try ( //java.lang.autocloseable에 속한 객체들
           //클라이언트가 연결되면 소켓 리턴
           //클라이언트는 한 줄 읽고 \n, \n 라인별로 요청, 마지막에 빈 엔터쓰고 내용 요청
           Socket socket = this.socket;
           BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));) {

         //바이너리라도 println의 기능이 들어있음 //버퍼쓰면 항상 쓸 때마다 flush()
         //System.out.println("---------------------------------"); //파비콘 달라고 2번 요청

         String line = null;
         boolean requestLine = true;
         while (true) {
           line = in.readLine();
           if (line.isEmpty())
             break;
           
           if (requestLine) {  //첫 줄: requestLine 두번째 줄부터:HeaderLine
             System.out.println(line); //requestLine일때만 딱 한 줄 출력하고
//             int startSpaceIndex = line.indexOf(" ");
//             int lastSpaceIndex = line.lastIndexOf(" ");
//             String url = line.substring(startSpaceIndex + 1, lastSpaceIndex); //startSpaceIndex + 1: 그 다음부터 lastindex까지. +1 안하면 공백이 포함됨
             System.out.printf("url: '%s'\n", extractUrl(line));
             requestLine = false; //다음부터는 출력하지 말아라
           }
         }
         
         // 쓰레드가 서로 경쟁하면서 자기가 실행하려고 해서 순서가 뒤죽박죽임
         out.println("HTTP/1.1 200 OK");
         out.println("Server: BIT Server");
         out.println();
         out.println("<html>");
         out.println("<html>");
         out.println("<head>");
         out.println("   <meta charset='UTF-8'>");
         out.println("   <title>hello</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("   <h1>안녕하세요</h1>");
         out.println("</body>");
         out.println("</html>");
         out.println("<html>");
         out.flush();
       } catch (Exception e) {
         System.out.println(e.getMessage());
       }
       
     } //run()
     
     //내부에서만 쓸것이기 때문에 private
     private String extractUrl(String requestLine) { //메소드 이름 자체가 주석의 역할을 함
       return requestLine.substring(requestLine.indexOf(" ") + 1, requestLine.lastIndexOf(" ")); //startSpaceIndex + 1: 그 다음부터 lastindex까지. +1 안하면 공백이 포함됨
     }
   }
   
   
   
}
