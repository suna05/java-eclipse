/*5월 23일
 * 멀티 태스킹 : 스레드 만들고 실행하기 2
 * => 
 * => 
 * */
package step19;

public class Test03 {
  static class MyThread extends Thread {
   public MyThread(String name) {
     this.setName(name);
   }
   
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("[%s] %d\n", this.getName(), i);
      }
    }
  }
  

  
  public static void main(String[] args) {
    MyThread t1 = new MyThread("t1");
    MyThread t2 = new MyThread("t2");
    MyThread t3 = new MyThread("t3");
   
    
    t1.start();  //t1 스레드를 독립적으로 실행시킨 후 즉시 리턴한다.
    t2.start();
    t3.start();
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("[main] %d\n", i);
    }
    
    
  }
  
 
  }
  
  

