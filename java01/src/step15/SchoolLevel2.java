/*enum 문법: 상수를 정의할 때 값 지정 가능
 * */

package step15;

public enum SchoolLevel2 {
  HIGH_SHCOOL(1),  /*의미: SchoolLevel2  HIGH_SHCOOL = new SchoolLevel2();*/
  BARCHELOR(2),  
  MASTER(3),  
  DOCTOR(4);  

  //생성자를 통해 받은 값을 저장할 인스턴스 변수
  private final int value;
  
  //enum 객체에 값을 지정하고 싶다면
  //
  //
  //
  //
    
  SchoolLevel2(int value) {
    this.value = value;
  }
  
  //가능하면 인스턴스 변수에 직접 접근하는 것을 막아라.
  //메서드를 통해 값을 꺼내도록 하라.
  public int value() {
    return this.value;
  }
}
