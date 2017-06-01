/*리터럴 - 이스케이프*/
package step01;
public class Test12 {
  public static void main(String[] args) {
  //"" 큰 따옴표를 사용하여 문자열을 표현
    System.out.println("ABC\b가각간");  //backspace (0x0008)
    System.out.println("ABC\t가각간");  //tab (0x0009)
    System.out.println("ABC\n가각간"); //lineFeed(new line) (0x000a)
    System.out.println("ABC\f가각간"); //formfeed. 현재 커서의 위치에서 줄을 바꾼다. (0x000c)
    System.out.println("-------------------------");
    System.out.println("ABC\r가각간"); //carrage return (0x000d)
    System.out.println("ABC\"가각간"); //double quote (0x0022)
    System.out.println("ABC'가각간"); // single quote (0x0027)
    System.out.println("ABC\'가각간"); // 큰 따옴표 안에서는 탈출할 필요가 없다. 
                                                    //그냥 작은 따옴표 사용
   // char c1 = '''; // 작은 따옴표 문자의 유니코드 값을 알고 싶을 때,  
        //작은 따옴표 안에서는 작은 따옴표를 그냥 적을 수 없다.
        //이 경우 이스케이프 문자 사용
    char c2 = '\'';
    System.out.println(c2); 
    System.out.println("ABC\\가각간"); //역슬래시 : (0x005c)
    //역 슬래시를 그냥 적으면 다음에 이스케이프 문자가 와야한다.
    //역슬래시를 그냥 적고 싶다면, 이스케이프 문자로 적어라. 
    
    System.out.println("c:\\workspace\\java01\\src\\step01\\Test12.java");
    
  }
}

/*이스케이스 문자*/