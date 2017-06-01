/*5/24  소켓프로그래밍:  파일 전송 서버 프로그램 
 * 
 * */
package step18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;



public class Test04_1 {
  public static void main(String[] args) throws Exception{
    System.out.println("서버 실행 중..");

    ServerSocket serverSocket  = new ServerSocket(8888);

    while (true) {
      try (
          Socket socket = serverSocket.accept();  
          DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());) { //enter를 받기 위해
        String filename = in.readUTF(); 

        long length = in.readLong();

        try(
            BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("temp/" + filename)); ) {

          for (long i =0 ;i <length ; i++) {
            fileOut.write(in.read());
          }
          fileOut.flush(); //버퍼에 남아 있는 데이터를 마저 출력한다.
        } catch (Exception e) {
          System.out.println("파일 저장 중 오류 발생");
        }

        out.println("ok");

      } catch (Exception e) {
        e.printStackTrace();
      } 
    }    
  }
}
