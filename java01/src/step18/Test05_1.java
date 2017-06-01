/*5/24  소켓프로그래밍:  Http 클라이언트 만들기 
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



public class Test05_1 {
  public static void main(String[] args) throws Exception{
   
    if(args.length < 1) {
      System.out.println("[사용법] > java -cp bin step18.Test05_1 URL");
      return;
    }
    
    //URL에서 host주소, 포트 번호, 자원경로를 분리한다.
    //예) http://www.google.com:80/test.html
    //=> host: www.google.com
    //=> port: 80
    //=> path: /test.html
    String url = args[0].replace("http://", "");
    
    //url에 콜론(:)이 있다면 포트 번호가 있다면 
    String host = null;
    int port = 80;
    int colonIndex = url.indexOf(":");
    int firstSlashIndex = url.indexOf("/"); 
    String path = url.substring(firstSlashIndex);
    
    if ( colonIndex >= 0) {
      host = url.substring(0, colonIndex);
      port = Integer.parseInt(url.substring(colonIndex + 1 , firstSlashIndex));
    } else {
      host = url.substring(0, firstSlashIndex); //end는 포함하지 않음. (0,5)면 0,1,2,3,4까지만 뽑음
    }
    /*
    System.out.println(url);
    System.out.println(host);
    System.out.println(port);
    System.out.println(path);
    
    */
    
    //프로그램 아규먼트로 넘어온 값을 가지고 파일을 읽을 준비를 한다.
    //File file = new File(args[2]);
    try (  //()안에 놓여진 클래스는 auto
    
    Socket socket = new Socket(host, port);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //바이트스트림을 캐릭터스트림에 연결할 수 있음
    PrintStream out = new PrintStream( 
                                    (new BufferedOutputStream(socket.getOutputStream()))); ) { 
  
        
        //HTTP서버에게 요청 데이터를 보낸다.
        //1) request line - 예) GET /test/ok/index.html 
        out.printf("GET %s HTTP/1.1\n", path);
                
        //2) header(general + request + entity) : 예) Host: www.daum.net
        //
        out.printf("Host: %s\n", host);    
        
       //3) 요청 데이터의 끝을 의미하는 줄 바꿈 코드를 보낸다
        out.println();
        out.flush();  //BufferedOutputStream을 써줬기 때문에
        
        
        String str = null;
        while(true) {
          str=in.readLine();
          System.out.println(str);
          if (str.length() == 0){
            break;
          }
        }
        int ch;
        while((ch = in.read()) != -1) {
          System.out.print((char)ch);
        }
               
        }catch (Exception e) {
          e.printStackTrace();
    }
   
  } 
}    
  

