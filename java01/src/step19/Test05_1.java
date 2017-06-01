/*5월 24일  멀티 태스킹 : Critical Section(Critical Region)
 * => 자바는 스레드의 우선순위를 10단계로 나눠 관리한다.
 *      1~10까지 지정한다.
 * => "main"스레드의 기본 우선 순위는 5이다.
 * => 스레드를 만들 때,  
 * */
package step19;

public class Test05_1 {
  static class Account {
    long balance;
    
    public Account (long balance) {
      this.balance =balance;
    }
    
    public long withdraw (long money) {
      long temp = this.balance;
     
      //delay 약간의 시간 지연을 발생시킨다.
      //왜? cpu사용권을 뺏기기 위함.
      double x = 3.141592;
      int delayCount = (int)(Math.random() * 10);
      for (int i = 0; i < delayCount; i++) 
        x /= 345.2345;
        
        temp -= money;
        
        if(temp >= 0) {
          this.balance = temp;
          return money;
        
      }
        return 0;
     // return delayCount;
    }
    
  }
  
  static class ATM extends Thread {  //1000번 반복하면서 독립적인 실행
    Account account;
    
   public ATM(String name, Account account) {
     super(name); //super클래스의 이름을 받는 생성자 호출
     this.account = account;
   }
   
    public void run() {
      long sum = 0;
      for (int i = 0; i < 10000; i++) {
        long money = this.account.withdraw(100);
        if (money == 0) 
          break;
        
        sum += money;
      }
      System.out.printf("%s = %d\n", this.getName(), sum);
    }
  }
    

  
  public static void main(String[] args) {
    Account account = new Account(1_000_000); //_는 마음대로 사용할 수 있음
    ATM t1 = new ATM("강남", account); //쓰레드
    ATM t2 = new ATM("강북", account);
    ATM t3 = new ATM("강원", account);
    ATM t4 = new ATM("제주", account);
    
    t1.start(); //출금 시작
    t2.start();
    t3.start();
    t4.start();
    
    
  }
  
 
  }
  
  

