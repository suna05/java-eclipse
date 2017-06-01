package step07;

public class test01_3 {
  static class Student {
    static String name;
    static int age;
    static boolean working;
  }
  
  public static void main(String[] args) {
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
   
   //System.out.println(a);

  }

}
