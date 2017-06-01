package step07;

public class test02_2 {
  static class Student {
    static int guest = 0;
    static int member = 1;
    static int admin = 2;
    
    String name;
    int age;
    boolean working;
    int level;
    
  }
  
  public static void main(String[] args) {
   
    Student s1 = new Student();
    Student s2 = new Student();
    
    s1.name = "홍길동";
   s1.age = 20;
   s1.working = true;
   s1.level = Student.guest; //클래스 변수임을 명확하게 알 수 있음(Student)
   
   s2.name = "임꺽정";
   s2.age = 30;
   s2.working = true;
   s2.level = Student.admin; 
   
   
   System.out.println(s1.name);
   System.out.println(s1.age);
   System.out.println(s1.working);
   
   int a;
   //a는 변수가 아님. 명령어임.

   
   //System.out.println(a);

  }

}
