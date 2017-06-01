/*5월 23일
 * 멀티 태스킹 : 스레드 만들고 실행하기
 * -> 만드는 방법
 *       1) 
 *       2)
 * => 
 * */
package step19;

public class Test02 {
  static class MyThread extends Thread {
    //Thread를 상속 받아서 run()메서드를 오버라딩 한다.
    //그리고 run() 메서드 안에 "main" 스레드와 병행하여(동시에) 실행할 코드를 둔다.
    public void run() {
      System.out.println("MyThread...");
    }
  }
  
  static class MyJob implements Runnable {
    //"main" 스레드와 병행하여(동시에) 실행할 코드는 
    //Runnable 규칙에 따라 만든 클래스에서 run()메서드 안에 둔다.
    public void run() {
      System.out.println("MyJob....");
    }
  }
  
  public static void main(String[] args) {
   MyThread t = new MyThread();
   t.start();
   
   MyJob job = new MyJob();
   Thread t2 = new Thread(job);
   
   t2.start();
   
  }
  
 
  }
  
  

