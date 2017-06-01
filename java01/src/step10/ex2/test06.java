//다형성-다형적 변수와 instanceof 연산자
/*=>  
 * */
package step10.ex2;

public class test06 {
  public static void main(String[] args) {
    Member m = new Member();
    m.name = "홍길동";
    m.id = "hong";
    m.password = "1111";
    m.email = "hong@test.com";
    m.tel = "111-1111";
    //m.schoolName ="비트대학교"; (X)
       
    
    FreeStudent s = (FreeStudent)m;
    s.schoolName ="비트대학교";
    s.grade = 4;
    s.acount = "111-11-1111";
    s.bank="한국은행";
    s.working = true;
  
    System.out.println(s.name);
    System.out.println(s.id);
    System.out.println(s.password);
    System.out.println(s.email);
    System.out.println(s.tel);
    System.out.println(s.schoolName);
    System.out.println(s.grade);
    System.out.println(s.acount);
    System.out.println(s.bank);
    System.out.println(s.working);
  }
  
}
