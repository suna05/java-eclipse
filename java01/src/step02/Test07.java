/* 변수 선언: 배열변수와 초기화  */
package step02;

public class Test07 {

  public static void main(String[] args) {
    //1)
   byte[] arr1 = new byte[3];   
   arr1[0]=10;
   arr1[1] = 20;
   arr1[2] = 30;   
   System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
   
   
   //2) 배열 선언과 동시에 그 배열 항목에 값을 지정할 수 있음
   byte[] arr2 = new byte[] {40,50,60};
   System.out.printf("%d, %d, %d\n", arr2[0], arr2[1], arr2[2]);
   
   byte[] arr4;
   arr4 = new byte[] {100, 101 , 102}; //OK. {}앞에 byte배열임을 알려줘서.
   System.out.printf("%d, %d, %d\n", arr4[0], arr4[1], arr4[2]);

   
   //3) 배열 선언과 동시에 그 배열 항복에 값을 지정할 때 => new 명령 생략 가능
   byte[] arr3= {70,80,90};
   System.out.printf("%d, %d, %d\n", arr3[0], arr3[1], arr3[2]);
   
   //그러나, 변수를 선언한 후 값을 초기화 시키는 명령을 사용할 수 없음
   byte[] arr5;
   //arr5 = {70, 80, 90}; //컴파일 오류 
  }
}
