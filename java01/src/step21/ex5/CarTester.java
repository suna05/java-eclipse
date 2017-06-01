package step21.ex5;

public class CarTester {//스태틱 메소드=클래스
  public static void test(Car car) { //그 자식클래스의 인스턴스 주소를 다 받아올 수 있음.
    //static 인스턴스를 만들 필요없이 클래스 이름으로 바로 호출될 수 있다. 개별적인 값을 안받아와도 될때
    //인스턴스(:구분되는 정보)를 구분할 필요없이 바로 클래스 호출 가능
    //인스턴스 변수는 new로 생성: static을 안쓰면 됨 ->인스턴스 메소드
    //(계산기: static: 인스턴스 변수에 접근 불가), 인스턴스 변수:this사용 
    System.out.println("자동차 테스트 시작!");
    
    //다음 코드의  run()메서드는 추상 클래스 Car의
    //추상 메서드인 run() 을 호출하는 것이 아니다.
    //실제 파라미터에 넘어온 객체의 실제 클래스에 대해서 run()을 호출하는 것이다.
    //만약 car 변수에 Sedan 객체(인스턴스의 주소)가 저장되어 있다면
    //Sedan 클래스의 run()을 호출한다.
    //만약 car변수에 Truck객체가 저장되어 있다면
    //Truck 클래스의 run()을 호출한다.
    
    car.run(); //car라는 변수에 저장된 이 인스턴스를 가지고 run() 을 실행한다.
    System.out.println("자동차 테스트 끝!");
  }

}
