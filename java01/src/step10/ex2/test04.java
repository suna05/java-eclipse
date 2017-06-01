//다형성-다형적 변수와 instanceof 연산자
/*=>  
 * */
package step10.ex2;

public class test04 {
  public static void main(String[] args) {
      checkRefernce(new Member());
    checkRefernce(new Student());
    checkRefernce(new Manager());
    checkRefernce(new Teacher());
    checkRefernce(new FreeStudent());
   
  }
  static void checkRefernce(Object obj) {
    if (obj instanceof Member)
      System.out.println("Member의 인스턴스이다");
    if (obj instanceof Student) 
      System.out.println("Student의 인스턴스이다");
    if (obj instanceof Manager) 
      System.out.println("Manager의 인스턴스이다");
    if (obj instanceof Teacher) 
      System.out.println("Teacher의 인스턴스이다");
    if (obj instanceof FreeStudent) 
      System.out.println("FreeStudent의 인스턴스이다");
    System.out.println("---------------------");
  }
}
