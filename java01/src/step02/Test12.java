/*5월 4일 목요일*/
/*사용자 정의 데이터 타입*/
package step02;

public class Test12 {
  public static void main(String[] args) {
    //1) 새 데이터 타입을 정의한다.
    class Student {
       String name;
       byte[] scores;
       short total;
       float aver;
    }

    //2) 새 데이터 타입에 따라 만든 메모리의 주소를 담을 변수 선언
    Student s1;
    
    //3) 새 데이터 타입에 따라 메모리를 준비한다.
    // 이 메모리를 인스턴스라고 한다.
    //=> 리턴 값은 새로 준비한 메모리의 주소이다.
    s1 = new Student();
    
    //4) 그 메모리에 값 넣기
    s1.name = "홍길동";
    s1.scores =  new byte[3];
    s1.scores[0] = 100;
    s1.scores[1] = 100;
    s1.scores[2] = 100;
    s1.total = (short)(s1.scores[0] + s1.scores[1] + s1.scores[2]);
    s1.aver = s1.total/3f;
  
     System.out.printf("%s, %d, %d, %d, %d, %f\n", 
        s1.name, s1.scores[0],s1.scores[1], s1.scores[2], s1.total, s1.aver);
    
     
     Student s2 = s1;
     s2.name = "임꺽정";
         System.out.printf("%s, %d, %d, %d, %d, %f\n", 
             s1.name, s1.scores[0],s1.scores[1], s1.scores[2], s1.total, s1.aver);
         
         //자바는 자바스크립트와 다르게 설계도에 따라 만든 메모리 외에는 임의로
         // 다른 메모리를 추가할 수 없다.
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
 *    
 *  
 * 인스턴스?
 * => class 설계도에 따라 준비한 메모리
 * => 보통 객체(object)라고도 부른다.
 *
 *레퍼런스?
 * => 배열이든 인스턴스이든 메모리의 주소를 저장하는 변수
 * 
 * 
 * */
