//다형성-다형적 변수의 응용
/*=>  
 * */
package step10.ex2;

public class test03 {
  public static void main(String[] args) {
    Member[] arr = new Member[10];
    arr[0] = new Member();
    arr[1] = new Student();
    arr[2] = new Manager();
    arr[3] = new Teacher();
    arr[4] = new FreeStudent();    
  }
}
