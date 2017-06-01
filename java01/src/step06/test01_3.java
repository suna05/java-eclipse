/* class 문법의 용도 : 사용자 정의 데이터 타입 만들기 3
 * => 인스턴스(=객체)를 다루는 메서드는 그 인스턴스와 관련된 클래스 블록안에 둔다.
 * */

package step06;

public class test01_3 {
 //1) 사용자 정의 데이터 타입 만들기
  static class Student {
    String name;
    int[] scores = new int[3];
    int total;
    float aver;

    public static void init(Student s, String name, int kor, int eng, int math) {
      s.name = name;
      s.scores[0] = kor;
      s.scores[1] = eng;
      s.scores[2] = math;
    }
    
    public static void compute(Student s) {
      s.total = s.scores[0] + s.scores[1] + s.scores[2];
      s.aver = s.total  / 3f;
    }
    
    
    public static void print(Student s) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n", 
          s.name, s.scores[0], s.scores[1], s.scores[2], s.total, s.aver);
    }
    
    
  }
  
  
  
  public static void main(String[] args) {
   
    Student s1 = new Student();  
   //주석
   Student.init(s1, "홍길동", 100, 100, 100);
   Student.compute(s1);
   
   Student s2 = new Student();
   Student.init(s2, "임꺽정", 90, 90, 90);
   Student.compute(s2);
   
   Student s3 = new Student();
   Student.init(s3, "유관순", 80, 80, 80);
   Student.compute(s3);
   
   Student.print(s1);
   Student.print(s2);
   Student.print(s3);
}

}
