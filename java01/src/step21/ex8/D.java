/*인터페이스 3
 * => 인터페이스는 다중 상속이 가능
 * */
package step21.ex8;

public interface D  extends B, C {
   void m3(); //오류X
  //int m3(); //메서드를 추가하는 것은 안된다.
              //이미 같은 이름을 가지면서 파라미터의 타입도 일치하는 메서드가 있는데
              //리턴 타입만 달리해서 메서드를 선언하면
   
   
   //
   int m3(int a, int b);
   
      
   void m7();
}
