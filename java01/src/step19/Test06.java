/*5월 24일  멀티 태스킹 : 스레드의 life cycle :<sleep>
 * => 생명주기
 * 
 * 
 * */
package step19;

public class Test06 {
  
  static class Worker {
    public void play() {
      System.out.println("오호라~~~~~~ 놀자");
    }
  }
  static class MyThread extends Thread {
    Worker worker;
    
    public MyThread(Worker worker) {
     this.worker = worker;
   }
   
    public void run() {
     while (true) {
       worker.play();
       try {
         Thread.sleep(1000);
      } catch (Exception e) {
         
       }
     }
    }
  }
  
  
  public static void main(String[] args) {
    Worker worker = new Worker();
    MyThread t1 = new MyThread(worker);
    
    t1.start();

    //t1 쓰레드를 실행시켜놓고 
    //"main"쓰레드는 자식 쓰레드가 종료될 때까지 계속 실행한다.
    System.out.println("main() 끝~");
    
    
  
    
    
  }
}
  
  

