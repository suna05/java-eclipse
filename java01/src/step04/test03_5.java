/*문장: 반복문 while - 반복문 중첩 + break 문*/
package step04;

public class test03_5 {

    public static void main(String[] args) {
  
      int i = 2;
      int j = 1;
      int r = 0;

      
      while (i < 10) {
        j=1;
       while ( j< 10) {
         System.out.printf("%d * %d = %d\n", i, j, (i*j));
         if (i == 5 && j == 5)
           break; // 가장 가까운 반복문 탈출!
         j++;
         }
       System.out.println("----------------");
       i++;
       
     }
      
  }

}
