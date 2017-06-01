//다형성-다형적 변수2
/*=> 왜 수퍼클래스의 인스턴스를 저장할 수 없는가?
 * */
package step10.ex2;

public class test02 {
  public static void main(String[] args) {
   //Member m = new Member();
  //Member m = new Student();
   Member m = new FreeStudent();
    m.name = "홍길동";
   m.id = "hong";
   m.password = "1111";
   m.tel = "1111-111";
   m.email = "hong@test.com";

   //Student s = new Student(); 
   Student s = new FreeStudent();
   //Student s = new Member(); Error => Student()에 추가된 항목을 사용할 수 없기 때문에
   s.name = "홍길동";
   s.id = "hong";
   s.password = "1111";
   s.tel = "1111-111";
   s.email = "hong@test.com";
   s.schoolName = "비트대학교"; //Member()에는 없음
   s.grade = 4; //Member()에는 없음
  }

}
