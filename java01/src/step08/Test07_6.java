/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- java.util.HashSet 3
* => 저장하려는 객체에 대해 hashCode() 호출
 */
package step08;
 
import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;


public class Test07_6 {
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page) {
      this.title = title;
      this.press = press;
      this.page = page;
    }
    
    public String toString() {    
      return String.format("%s, %s, %s", title, press, page);
    }
    

    public int hashCode() {      
      return 1;
    }
    
    /*hashCode()메서드 뿐만 아니라*/
    
    
    public boolean equals(Object obj) {      
      return true;
    }
  }
   
  public static void main(String[] args) {
    HashSet Set = new HashSet();
   
    Set.add(new Book("aaa", "비트출판사",100));
    Set.add(new Book("bbb", "비트출판사",200));
    Set.add(new Book("ccc", "비트출판사",300));
    Set.add(new Book("ddd", "비트출판사",400));
    Set.add(new Book("eee", "비트출판사",500));
    Set.add(new Book("fff", "비트출판사",600));
    Set.add(new Book("fff", "비트출판사",600));
  
    
    /*결론!
     *HashSet 컬렉션에 값을 저장할 때
     * 인스턴스의 주소가 영향을 끼치는 것이 아니라 
     * hashCode()의 리턴값이 영향을 끼친다.
     * */
    
    //방법2) 값을 꺼내주는 도구를 먼저 얻는다.
   Iterator iterator = Set.iterator();
   while (iterator.hasNext()) {
     System.out.println(iterator.next());
   }
     System.out.println("=============");
   
   System.out.println(new Book("fff", "비트출판사",600).hashCode());
   System.out.println(new Book("fff", "비트출판사",600).hashCode());
   System.out.println(new Book("fff", "비트출판사",600).hashCode());
  
  
  
  }  
 }


