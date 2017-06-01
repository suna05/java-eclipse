/* 유틸리티 클래스 : Object - toStirng()
 * => 
 * =>
 * 
 */
package step08;

//주석
public class Test03_2 /*extends Object*/{
  
  //주석
  static class Student1 /*extends Object*/{
    String name;
    int age;
  }
  
  static class Student2 /*extends Object*/{
    String name;
    int age;
    
    public String toString() {
      return String.format("이름: %s\n 나이: %d\n", name, age);
    }
  }
  
  public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.name = "홍길동";
    s1.age = 20;
    
    Student2 s2 = new Student2();
    s2.name = "임꺽정";
    s2.age = 30;
    
    System.out.println(s1.toString());
    System.out.println("------------------------");
    System.out.println(s2.toString());
 
    
  }

}
