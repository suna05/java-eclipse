/* 목록을 다루는 클래스 구현
 * => 배열을 이용하여 데이터 목록을 다루는 ArrayList구현
 * 
 */
package step08;


 class Test06_2_ArrayList {
  //값을 조회하는 용도로만 사용하고 싶은 변수가 있다면, 읽기 전용으로 만들어라!
//final 명령을 변수 선언 앞에 붙인다.

public static final int DEFAULT_SIZE = 3;  //public static final 순서를 많이 씀
  static public final int GROW_SIZE = 3;
 
  //클래스 멤버만이 접근할 수 있게 접근을 제한한다.
private Object[] list;
private int length;
    
public Test06_2_ArrayList() {
  list = new Object[DEFAULT_SIZE];
  
}

public Test06_2_ArrayList(int capacity) {
  if (capacity < DEFAULT_SIZE || capacity > GROW_SIZE) {
    list = new Object[DEFAULT_SIZE];
  } else {
    list = new Object[capacity];
  }
}

//맨 끝 빈 방에 값을 넣는다.
public void add(Object obj) {
  list[length++] = obj;
  //현재 length가 가리키는 방에다가 값을 넣고, length를 나중에 따로 1증가(index가 [0]부터 시작해서)
 
  //배열이 꽉 찼을 때 배열의 크기를 증가분 만큼 늘린다.
  if (length == list.length) {
  increaseList();
  }
}

//값이 들어 있는 중간 방에 새 값을 끼워 넣는다.
  public void add(int index, Object obj) {
    if (length == list.length) {
      increaseList();
    }
    
    if (index < 0 || index >= length) {
      throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
    }
    if (index <length) { //값들 사이에 새 값을 꼽는다면,
      //맨 마지막 값부터 index가 가리키는 방의 값까지 반복하면서 뒤로 한 칸씩 미룬다.
      for (int i = length; i > index; i--) {
        list[i] = list[i -1];
      }
    }  
    list[index] = obj;
    length++;
  } 

//ArrayList 클래스 내부에서만 사용할 메서드라면 굳이 공개하지 말아라.
//=> 메서드 선언 앞에 private를 붙인다.
private void increaseList() { 
    Object[] newList = new Object[list.length + GROW_SIZE]; // 새 배열을 만들고
    for (int i=0; i<list.length; i++) {
      newList[i] = list[i]; 
    }
  list = newList;
    }


  public int size() {
    return /*this.*/length; //인스턴스 주소 생략
  }

   public Object get(int index) {
     if (index < 0 || index >= length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     return list[index]; //이게 메소드의 기본
   }
   
   public Object remove(int index) {
     if (index < 0 || index >= length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     
     Object removedObj = list[index];
     
     if (index < (length - 1)) {
       for (int i = index; i< (length - 1); i++ )  {
         list[i] = list[i+1];
       }
     }
     length--;
     return removedObj;
   }
   
   
   public Object set(int index, Object obj) {
     if (index < 0 || index >= length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     
     Object oldObj = list[index];
     list[index] = obj;
     return oldObj;
   }
}
