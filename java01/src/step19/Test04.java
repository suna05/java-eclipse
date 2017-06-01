/*5월 24일  멀티 태스킹 : 스레드의 우선 순위
 * => 자바는 스레드의 우선순위를 10단계로 나눠 관리한다.
 *      1~10까지 지정한다.
 * => "main"스레드의 기본 우선 순위는 5이다.
 * => 스레드를 만들 때,  
 * */
package step19;

public class Test04 {
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
   
    Thread main = Thread.currentThread();
    
    System.out.printf("t1 = %d\n", t1.getPriority());
    System.out.printf("t2 = %d\n", t2.getPriority());
    System.out.printf("t3 = %d\n", t3.getPriority());
    System.out.printf("main = %d\n", main.getPriority());
    
    
  
    
    
  }
  
 
  }
  
  

