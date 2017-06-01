/*소켓 프로그래밍 : 여러 클라이언트의 요청을 처리하기(서버)
 *=> 
 * */
package step18;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test03_1 {
  public static void main(String[] args) throws Exception{
    System.out.println("서버 실행 중..");
   
    
    ServerSocket serverSocket  = new ServerSocket(8888);
    System.out.println("=> 서버 소켓 생성 완료");
    
    while(true) {
      try (  //선언하는 변수: java.lang.autoLanguage에서 지원한 것만 사용가능. int a = 1(X)   
          //연결정보로 소켓을 만듦 -> 연결정보로 입력 시스템을 얻음 -> 
            Socket socket = serverSocket.accept();  //대기열에 한명이라도 있어야 accept됨
            InputStream in0 = socket.getInputStream(); //인풋스트림의 서브클래스를 만들어서 인스턴스 반환
            OutputStream out0 = socket.getOutputStream(); 
            
            Scanner in = new Scanner(in0); //생성자에 input스트림을 넘겨주면 1바이트씩 호출(엔터만날때까지) scanner은 nextLine()을 사용할 수 있음
            PrintStream out = new PrintStream(out0); )
      //String str = in.nextLine();, out.println(str);을 사용하기 위해 PrintStream사용
      {  
      
            System.out.println("=> 클라이언트 연결 승인!");
            String str = in.nextLine();  //클라이언트로부터 문자열을 한 줄 읽는다.
            out.println(str); //클라이언트가 보낸 문자열 그대로 돌려줌
           } catch (Exception e) {}
        }
        
  }
}
