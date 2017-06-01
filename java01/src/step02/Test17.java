/*5월 4일 목요일*/
/*사용자 정의 데이터 타입: 1클래스 1파일(소스코드 유지보수 편하도록)
 * => 보통 유지보수를 쉽게 하기 위해 1클래스 당 하나의 파일 작성
 * => 클래스 문법?
 * .
 * .
 * .
  *  */
package step02;

public class Test17 {  
  public static void main(String[] args) {
     Student[] arr1= new Student[3];
    
    arr1[0] = new Student("홍길동", 100, 100, 100);
    arr1[1] = new Student("임꺽정", 90, 90, 90);
    arr1[2] = new Student("유관순", 80, 80, 80);

    
    for(int i =0; i<arr1.length ; i++)
    {
     Student.print(arr1[i]); 
    }
       
  }
}

