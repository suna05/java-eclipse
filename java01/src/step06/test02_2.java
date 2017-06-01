/*class 문법의 용도 : 관련된 메서드를 묶는 용도 2
 * => 코드를 기능별로 묶어서 정의해 두면 필요할 때 마다 사용하기 편해진다.
 * 메서드 - 코드를 기능 별로 묶은 것
 * */

package step06;

import step06.test01_2.Student;

public class test02_2 {
  //이 클래스의 메서드들이 사용할 변수 선언
  static String name;
  static int[] scores = new int[3];
  static int total;
  static float aver;
  
  //변수의 값을 초기화 시키는 기능을 수행하는 코드를 init() 블록 안에 묶어두었다.
  public static void init(String n, int k, int e, int m) {
    name = n;
    scores[0] = k;
    scores[1] = e;
    scores[2] = m;
  }
  
  public static void compute() {
    total = scores[0] + scores[1] + scores[2];
    aver = total  / 3f;
  }

  public static void print() {
    System.out.printf("%s, %d, %d, %d, %d, %f\n", 
        name, scores[0], scores[1], scores[2], total, aver);
 }
  
  
  
  public static void main(String[] args) {
    //주석 
    init("홍길동", 100, 100, 100);
     compute();
     print();

  }

}
