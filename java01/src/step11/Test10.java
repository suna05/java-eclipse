/*캡슐화: 필드와 프로퍼티2
 * => 클래스 안에 선언된 클래스를 중첩 클래스라고 부른다.
 *      또는 "내부 클래스"라고도 부른다.
 * => inner 클래스는 클래스 안에 선언되기 때문에
 *      그 바깥 클래스의 멤버이다.
 *      따라서 클래스의 멤버인 변수나 메서드와 똑같이 modifier를 사용할 수 있다.
 *        
 * */

package step11;

public class Test10 {  
  static enum SchoolLevel {
    HiGH_SCHOOL, BARCHELOR, MASTER, DOCTOR
  }
  
  static class Student {
    
    //필드 선언
    private String name;
    private int age;
    private SchoolLevel level;

  
  
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public SchoolLevel getLevel() {
      return level;
    }

    public void setLevel(SchoolLevel level) {
      this.level = level;
    }
  }
  
    public static void main(String[] args) {
      Student s = new Student();
      s.setName("홍길동");
      s.setAge(20);
      s.setLevel(SchoolLevel.BARCHELOR);
    }
  
}

