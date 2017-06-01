/*소켓 프로그래밍 : 클라이언트 프로그램 만들기
 * => 
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_2 {
  public static void main(String[] args) throws Exception{
    //1) 클라이언트 소켓 만들기
    //
    Socket socket  = new Socket("127.0.0.1", 8888);
    
    //2) 
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //3) 서버에서 먼저 읽는다면 클라이언트는 먼저 데이터를 보내야한다.
    //    거꾸로 서버에서 데이터를 먼저 보낸다면 클라이언트는 먼저 데이터를 읽어야한다.
    out.write(0x77); //클라이언트가 보낸 데이터를 서버가 모두 읽을 때까지 리턴하지 않는다. => blocking
    int b = in.read(); //서버가 보낸 데이터를 (1바이트) 읽을 때까지 리턴하지 않는다. => blocking
    
    System.out.printf("%x\n", b);    
    //5) 
    in.close();
    out.close();
    socket.close();

    
  }
}
