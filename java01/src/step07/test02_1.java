package step07;

public class test02_1 {
  static class Student {
    static String name;
    static int age;
    static boolean working;
  }
  
  public static void main(String[] args) {
   
    Student s = null;
    System.out.println(Student.name);
   System.out.println(Student.age);
   System.out.println(Student.working);
    Student.name = "홍길동";
   Student.age = 20;
   Student.working = true;
   
   System.out.println(Student.name);
   System.out.println(Student.age);
   System.out.println(Student.working);
   
   int a;
   //a는 변수가 아님. 명령어임.

   
   //System.out.println(a);

  }

}
