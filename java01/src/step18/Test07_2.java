/*5/25  소켓프로그래밍:  connectionoless 서버 만들기
 * => 
 * => 
 * */
package step18;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;


public class Test07_2 {
  class Value {
    int v1;
    int v2;
    String op;
  }

  class CalculatorJob implements Runnable {
    Socket socket;

    public CalculatorJob(Socket socket) {
      this.socket = socket;
      System.out.println("=> 클라이언트와 연결되었음!");
    }
    public void run() {  //run()말고 이외의 run2()등은 오류
      int count = 0;
      try(
          Socket socket = this.socket; //얘가 소켓을 닫아줌
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()));          
          PrintStream out = new PrintStream(socket.getOutputStream());

          /*
          InputStream in = socket.getInputStream();
          DataInputStream in2 = new DataInputStream();
          OutputStream out = socket.getOutputStream();
          DataOutputStream out2 = new DataOutputStream();
           */
          ) {
        String json = in.readLine(); 
        if (json == null)
          return;

        Gson gson = new Gson();

        Value value = gson.fromJson(json, Value.class); //Value.class에서 Value는 class 변수임

        float result = 0;

        switch (value.op) {
        case "+": result =(float)value.v1 + value.v2; break;
        case "-": result =(float)value.v1 - value.v2; break;
        case "*": result =(float)value.v1 * value.v2; break;
        case "/": result =(float)value.v1 / value.v2; break;
        case "%": result =(float)value.v1 % value.v2; break;
        }

        //
        if (++count > 5 ) { 
          out.println("무료 사용 끝!");
        } else {
          out.println(result);
        }
        out.flush();

        System.out.println("=> 클라이언트와 연결 끊김");

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }


  public void listen(int port) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중.....");

    while (true) {      
      new Thread(new CalculatorJob(serverSocket.accept())).start();      

      /*
       CalculatorJob job= new CalculatorJob(serverSocket.accept());  // 이 job변수를 아래에서 딱 한 번 씀. 위와 같이 줄여 씀
       new Thread(job).start();  //job에 들어간 것은 Runnable 규칙에 따라 만들어진 객체가 들어옴.
       */
    }
  }

  public static void main(String[] args) throws Exception{
    Test07_2 server = new Test07_2();
    server.listen(8888);


  } 
}    
