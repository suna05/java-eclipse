/* class 문법의 용도 : 사용자 정의 데이터 타입 만들기 4
 * => 
 * */

package step06;

public class test01_4 {
  
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
