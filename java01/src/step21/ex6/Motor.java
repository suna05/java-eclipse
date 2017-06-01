package step21.ex6;

public abstract class Motor {  //이 클래스의 인스턴스를 직접 만들어서 쓰느냐 안쓰느냐->안쓰면 abstract
  float ampere; //암페어
  int rpm; //분당 회전수
  float watt; //와트
  
  public Motor() {}
  
  public Motor(float ampere, int rpm, float watt) {
    this.ampere = ampere;
    this.rpm = rpm;
    this.watt = watt;
  }
}
