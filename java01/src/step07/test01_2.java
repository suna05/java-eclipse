package step07;

public class test01_2 {
  //주석
   
  
  //=> 클래스 변수는 클래스 이름이나 인스턴스 주소를 이용하여 접근할 수 있다.
  //      => 클래스명.클래스변수명
  //      => 인스턴스변수.클래스변수명
  static class Student {
    static String name;
    static int age;
    static boolean working;
  
    static void m1() {}
  }
  
  public static void main(String[] args) {
    //클래스 로딩 시점을 확인하자.
    //1) 레퍼런스 변수를 만들 때?
    Student s;
    
    //2) class 변수를 사용할 때? 클래스를 로딩한다.
    //System.out.println(Student.name);
    
    
    //3) 클래스 메서드를 호출할 때? 클래스를 로딩한다.
    // => 클래스의 메서드를 호출하려면 클래스 코드가 메모리에 있어야 할 것 아닌가...
    //Student.m1();
    
    //4) new 명령을 사용할 때? 클래스를 로딩한다.
    // =>  인스턴스를 생성하려면 클래스 설계도가 필요하고,
    // => 인스턴스를 생성한 후 생성자 메서드를 호출해야한다.
    //그러니 당연히 클래스가 로딩되어야한다.
    new Student();

  }

}
