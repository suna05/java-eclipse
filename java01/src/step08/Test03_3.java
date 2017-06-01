/* 유틸리티 클래스 : Object - equals()
 * => 
 * =>
 * 
 */
package step08;

//주석
public class Test03_3 /*extends Object*/{
  
  //주석
  static class Student1 /*extends Object*/{
    String name;
    int age;
  }
  
  static class Student2 /*extends Object*/{
    String name;
    int age;
    
    
    public boolean equals(Object obj) {
      if (!(obj instanceof Student2)) return false;
      
      //파라미터로 넘어온 값이 Student2 인스턴스의 주소가 맞다면,
      //검사하기 쉽게 일단 Student2 타입으로 형변환 한다.
      Student2 other = (Student2)obj;
      
      if (!this.name.equals(other.name)) return false;
      if (this.age != other.age) return false;
      
      return true;
    }
  }
  
  public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.name = "홍길동";
    s1.age = 20;
    
    Student1 s2 = new Student1();
    s2.name = "홍길동";
    s2.age = 20;
    
    System.out.println(s1 == s2); //인스턴스, 당연히 주소는 다르다.
    System.out.println(s1.equals(s2)); //Object의 equals()는 주소를 비교
                                                      //결국 ==와 연산 결과가 같다.
    
    
    
    
    Student2 s3 = new Student2();
    s3.name = "홍길동";
    s3.age = 20;
    
    Student2 s4 = new Student2();
    s4.name = "홍길동";
    s4.age = 20;
    
    System.out.println(s3 == s4); //당연히 주소는 다르다.
    System.out.println(s3.equals(s4)); //Student2에서 재정의한 equals()는
                                                    //인스턴스 주소가 아니라 값 비교

 
    
  }

}
