/*캡슐화: 중첩 클래스
 * => 클래스 안에 선언된 클래스를 중첩 클래스라고 부른다.
 *      또는 "내부 클래스"라고도 부른다.
 * => inner 클래스는 클래스 안에 선언되기 때문에
 *      그 바깥 클래스의 멤버이다.
 *      따라서 클래스의 멤버인 변수나 메서드와 똑같이 modifier를 사용할 수 있다.
 *        
 * */

package step11;

public class Test09 {  
  static class Student {
    public static final int HIGH_SHCOOL=1;
    public static final int BARCHELOR=2;
    public static final int MASTER=3;
    public static final int DOCTOR=4;
    
    //필드 선언
    private String name;
    private int age;
    private int level;
    
    //프로퍼티 선언
    //=> 필드의 값을 넣거나 꺼내는 메서드.
    //=> setXxx(), getXxx() 이름으로 메서드를 정의한다.
    //=> 그래서 setXxx() 메서드를 세터(setter)라고 부른다.
    
    public void setFullName(String fullName) { //읽고 - 프로퍼티:세터
      name = fullName;
    }
    public String getFullName() { //쓰고 - 프로퍼티: 게터( getter)
      return name;
    }
    
    public void setAge(int age) {
      if (age > 5 && age <100) {
        this.age = age;
      }
      throw new RuntimeException("나이는 6에서 99살까지 가능합니다.");
    }
    
    public int getAge() {
      return age;
    }
  
    public void setSchoolLevel(int level) {
      if (level >= 1 && level <= 4 ) {
        this.level = level;
      }
      throw new RuntimeException("학위 정보는 1에서 4까지 가능");
    }
  
    public static void main(String[] args) {
      Student s = new Student();
      s.setFullName("홍길동");
      s.setAge(20);
      s.setSchoolLevel(Student.DOCTOR);
    }
  
}
}
