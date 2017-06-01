//다형성-다형적 변수
/*=>
 * */
package step10.ex2;

public class test01 {
  public static void main(String[] args) {
   Member m = new Member();
   Student s1 = new Student();
   FreeStudent f1 = new FreeStudent();

   //다형적 변수(polymorphic variable)
   //한 개의 레퍼런스 변수가 다양한 종류의 객체의 주소를 담을 수 있다.
   //물론 서브 클래스의 객체 주소만 담을 수 있다.
   Member m2 = new Student();
   Member m3 = new Teacher();
   Member m4 = new FreeStudent();
   Student s2 = new FreeStudent();
  }

}
