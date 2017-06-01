/*소켓 프로그래밍 : 서버 소켓 대기열(서버)
 *=> 서버 소켓을 생성할 때 
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test02_1 {
  public static void main(String[] args) throws Exception{
    System.out.println("서버 실행 중..");
   
    //ServerSocket(포트번호port, 대기열의 수backlog)
    
    ServerSocket serverSocket  = new ServerSocket(8888, 3);
    
    Socket socket = serverSocket.accept();  //대기열에 한명이라도 있어야 accept됨
    InputStream in0 = socket.getInputStream();
    OutputStream out0 = socket.getOutputStream();
    
    Scanner in = new Scanner(in0);
    PrintStream out = new PrintStream(out0);
    
    String str = in.nextLine();  //클라이언트로부터 문자열을 한 줄 읽는다.
    out.println(str); //클라이언트가 보낸 문자열 그대로 돌려줌
    
    in.close();
    in0.close();
    out.close();
    out0.close();
    socket.close();
    serverSocket.close();
    
  }
}
