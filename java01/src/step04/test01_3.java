/*문장: 조건문 if와 중괄호{} */
package step04;

public class test01_3 {

  public static void main(String[] args) {
    int age = 57;
    
    if (age < 8)
      System.out.println("유아");
      else
        if (age >= 8 && age <14)
          System.out.println("어린이");
        else
          if  (age >=14 && age < 19)
            System.out.println("청소년");
          else
            if (age >= 19 && age < 65)
              System.out.println("성인");
            else
              System.out.println("노인");
    
    
    
      if (age < 8)
        System.out.println("유아");
      else if (age >= 8 && age <14)
          System.out.println("어린이");
      else if  (age >=14 && age < 19)
          System.out.println("청소년");
      else if (age >= 19 && age < 65)
          System.out.println("성인");
      else
        System.out.println("노인");
  }

}
