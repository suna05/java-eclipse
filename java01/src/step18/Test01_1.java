/*소켓 프로그래밍 : 서버 소켓 만들기
 * => 소켓(Sokect)?
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_1 {
  public static void main(String[] args) throws Exception{
    System.out.println("서버 실행 중..");
    //1) 서버 소켓 만들기
    ServerSocket serverSocket  = new ServerSocket(8888);
    
    //2) 대기열에 있는 클라이언트 중에서 첫 번째 
    Socket socket = serverSocket.accept();
    
    //3) 
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //4) 소켓으로  클라이언트와 연결되면
    int b = in.read();
    System.out.printf("%x \n", b);
    
    out.write(0x01);     //서버가 보낸 1바이트 데이터를 클라이언트에서 읽을 때까지 리턴하지 않는다.
    
    //5) 
    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    
  }
}
