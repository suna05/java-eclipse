/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- java.util.HashSet 5
* => 저장하려는 객체에 대해 hashCode() 호출
 */
package step08;
 
import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;


public class Test07_7 {
  
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
      final int prime = 31;
      int result = 1;
      result = prime * result + page;
      result = prime * result + ((press == null) ? 0 : press.hashCode());
      result = prime * result + ((title == null) ? 0 : title.hashCode());
      return result;
    }

 
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Book other = (Book) obj;
      if (page != other.page)
        return false;
      if (press == null) {
        if (other.press != null)
          return false;
      } else if (!press.equals(other.press))
        return false;
      if (title == null) {
        if (other.title != null)
          return false;
      } else if (!title.equals(other.title))
        return false;
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


