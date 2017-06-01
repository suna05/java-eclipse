package step10.ex1;

class BitStudent extends Student {
  String school;
    
  void print() {
    //
    
    /*System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n", age);
    */
    //재정의 하기 전의 메서드를 가리키기 위해
    // (주의!) 수퍼클래스라는 의미가 아니다.
    // super라는 키워드를 사용하여 메서드를 호출
    
    super.print();  //이 클래스에서 재정의하기 전의 print() 메서드를 호출하라는 의미
    System.out.printf("학교: %s\n", school);
   }

}
