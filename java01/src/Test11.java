
/*자바 프로그래밍 - 소스 파일과 디렉토리*/
package other;

public class Test11 {
  public static void main(String[] args) {
    System.out.println("TEST11...");
  }

  public static void m1() {
    System.out.println("src/Test11.m1()....");
  }
}

/*
한 폴더에 소스 파일을 모두 보관하게 되면 관리하기가 불편하다.
- 해결책? 소스 파일을 기능과 역할에 따라 여러 폴더에 분산 배치하면 된다.
- 문제점?
=> 컴파일을 하면 다른 클래스와 마찬가지로 같은 폴더에 놓이게 된다.
=> 혹여라도 다른 폴더에 있는 소스 파일의 클래스 이름이 같을 때 기존 폴더에 있는 클래스 파일을 덮어쓰게 된다.
예)
src/Test09.java
src/other/Test09.java

두 개의 파일을 컴파일하면 같은 폴더에 클래스 파일이 놓인다.
bin/Teset09.class

-클래스 파일이 같은 폴더에 놓임으로 인한 문제점 해결
 java01> javac -d bin/other src/other/Test09.java
 java01> javac -d bin src/test09.java

 -실행할 때는 어떻게?
 java01> java -cp bin/other Test09
 java01> java -cp bin Test09

 -정말 이것이 해결책?
 한 클래스에서 다른 클래스의 메서드를 사용할 때 문제가 된다.
 증명)
*/
