/* 증가/감소 연산자 - 전위 연산자와 후위 연산자의 차이점 3
 * */
package step03;

public class Test02_4 {

  public static void main(String[] args) {
     int i = 3;
     int r = ++i + ++i * ++i;
    System.out.printf("i = %d, r= %d\n",i,r);
  
    
    //2) 후위 연산자
    i = 3;
    r = i++ + i++ * i++; // r= 3 + 4 * 5 = 23
  
    System.out.printf("i = %d, r= %d\n",i,r);
        
        
    //3)섞어서
     i=3;
     r = ++i + ++i * i++; //r = 4 + 5 * 5 
     System.out.printf("i = %d, r= %d\n",i,r);
  }
 }

