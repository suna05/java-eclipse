/* 증가/감소 연산자 - 전위 연산자와 후위 연산자의 차이점
 * */
package step03;

public class Test02_2 {

  public static void main(String[] args) {
    //1) 전위(prefix) 연산자
    int x = 0;
    int i = 10;
    x = ++i;
    System.out.printf("i = %d, x = %d \n",i, x);
  
    
    //2) 후위 연산자
    i = 10;
    
    x = i++;
    /*실행 순서
     * =>  x = 10  주의! i 값을 그 자리에 놓은 상태이다. 할당 연산자를 실행하지는 않음
     *                   왜? 할당 연산자는 오른쪽 편(r-value)을 모두 실행한 다음에 마지막으로 실행하기 때문
     * => i = i+1
     * => x <==10 :  오른족 편(r-value)의 계산이 모두 완료되었기 때문에 
     *                 아까 실행하지 않은 할당 연산을 지금 실행한다.
     * */
    System.out.printf("i = %d, x = %d \n",i, x);
  }
 }

