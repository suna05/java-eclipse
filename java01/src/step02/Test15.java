/*5월 4일 목요일*/
/*사용자 정의 데이터 타입: 값 초기화 시키기 2
 * => 자바에서 기본 연산 단위는 int이기 때문에
 * byte 변수를 사용하는 것이 불편함.
 * => 보통 바이트 변수는 여러 개의 값을 담기 위해 배열로 선언해 사용한다.
 *    예) 이미지 파일과 같은 바이너리 파일을 읽을 때 그 값을 저장하기 위해 바이트 배열 사용.
 * => 일반적인 숫자 값을 다룰 때는 int
 *  */
package step02;

public class Test15 {
  //클래스를 특정 메서드 안에서 사용하고 싶다면 그 메서드에 선언하라.
  //그러나 다음과 같이 클래스 안에서 사용하고 싶다면, 그 클래스 안에서 선언하라.
  static class Student {
    String name;
    int[] scores;
    int total;
    float aver;
  }
  
  //리턴 값이 Student 주소 값
  public static Student createStudent(String name, int kor, int eng, int math) {
    Student s = new Student();
    s.name = name;
    s.scores = new int[]{kor, eng, math};
    s.total = kor + eng + math;
    s.aver = s.total / 3f;
    return s; //인스턴스의 주소를 리턴
  }
  
  
  //인스턴스의 값을 출력하는 메서드를 만들어 사용하자.
  public static void printStudent(Student s /*Student 인스턴스의 주소를 받을 변수*/){
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
        s.name,
        s.scores[0], s.scores[1], s.scores[2],
        s.total, s.aver);
  }
  
  public static void main(String[] args) {
     Student[] arr1= new Student[3];
    
    arr1[0] = createStudent("홍길동", 100, 100, 100);
    arr1[1] = createStudent("임꺽정", 90, 90, 90);
    arr1[2] = createStudent("유관순", 80, 80, 80);
    
   
     for(int i =0; i<arr1.length ; i++)
    {
       printStudent(arr1[i]);
      /*System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
              arr1[i].name,
              arr1[i].scores[0], arr1[i].scores[1], arr1[i].scores[2],
              arr1[i].total, arr1[i].aver);*/
    }
       
}
}


/*primitive data type
 * => byte, short, int, long, float, double, boolean, char
 * 
 * 사용자 정의 데이터 타입?
 * => 개발자가 자신이 원하는 방식으로 데이터를 묶어서 다루기 위해 새로 정의하는 데이터 타입
 * =>  문법
 * - class 데이터타입명 {
 *        데이터타입 변수명;
 *        ...
 *    }
 * */
