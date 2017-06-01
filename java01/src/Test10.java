/*자바 프로그래밍 - 다른 클래스의 메서드 호출하기*/

public class Test10 {
  public static void main(String[] args) {
    //bint/Test09.class 파일에 들어있는 m1()메서드 호출
    Test09.m1();

    //bin/other/Test09.class 파일에 들어있는 m1()메서드 호출
    //other/Test09.m1()
    Test09.m1() //구분 못함
  }
}

/*
다른 클래스의 메서드 호출하기.
-방법
클래스명.메서드명()

컴파일 할 때 이 클래스가 사용하는 다른 클래스의 위치를 알려줘야 컴파일이 된다.
- 방법
java01> javac -d 컴파일이된 클래스 파일이 놓일 폴더
              -cp or -classpath 사용할 클래스 파일이 있는 폴더 위치
java01> javac -d bin -cp bin src/Test10.java

-결론:
-소스 파일을 폴더로 분리하여 관리할 수는 있지만 실행할 때 다른 클래스를 사용할*/
