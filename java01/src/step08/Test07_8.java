/* 컬렉션 클래스 : 사용자 정의 컬렉션 클래스 사용 -- java.util.HashMap 2
* => 저장하려는 객체에 대해 hashCode() 호출
 */
package step08;
 
import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Test07_8 {  
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

 }
   
  public static void main(String[] args) {
    HashMap map = new HashMap();
   
    //put(key, value)
    
    map.put(new String("key1"),(new Book("aaa", "비트출판사",100)));
    map.put("key2", new Book("bbb", "비트출판사",200));
    map.put("key3", new Book("ccc", "비트출판사",300));
    map.put("key4", new Book("ddd", "비트출판사",400));
    map.put(1, new Book("eee", "비트출판사",500)); //자바 컴파일러가 new Integer() auto-boxing,
                                                                         //객체 주소가 놓이게 됨
    map.put("key6", new Book("fff", "비트출판사",600));
    map.put("key7",new Book("fff", "비트출판사",600));
  
    //값을 꺼내는 방법
    //=> 값을 저장할 때 사용한 key를 가지고 꺼낸다.
    //=> 반드시 같은 인스턴스일 필요는 없다.
    
    System.out.println(map.get(new String("key1")));
    System.out.println(map.get(1));
    
    
    /**/
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    if(s1 == s2) 
      System.out.println("s1 == s1");
    else
      System.out.println("s1 != s2");
    
    System.out.printf("%d, %d\n", s1.hashCode(), s2.hashCode());
    System.out.println(s1.equals(s2));
  
  }  
 }


