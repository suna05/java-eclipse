package step08;

class Test06_3_LinkedList {

  //값을 보관하고, 다음 값의 위치 정보를 보관한다.
   class Bucket {  //static: 클래스 멤버, static 없으면 : 인스턴스 멤버
     Object value;
     Bucket next;
   }
   Bucket start;
   Bucket end; //초기값을 안주면 0으로 초기화 됨
   private int length;
      
  public Test06_3_LinkedList() {
   //기본으로 빈 양동이를 준비하고,
   //시작과 끝 양동이의 위치 정보를 설정한다.
    start = new Bucket();
    end = start;
  }
  
  //맨 끝 양동이에 값을 넣는다.
  public void add(Object obj) {
    end.value = obj;
    
    Bucket temp = new Bucket();
    end.next = temp;
    end = temp;
    
    length++;
  }

//값이 들어 있는 중간 방에 새 값을 끼워 넣는다.
  public void add(int index, Object obj) {
    
    if (index < 0 || index >= length) {
      throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
    }
    
    //새 버킷을 준비하고, 값을 보관한다. 
    Bucket temp = new Bucket();
    temp.value = obj;
    length++;
    
    if (index == 0) {
      temp.next = start;
      start = temp;
      return;
      
    }
    

    Bucket cursor = start;
    
  //인덱스가 가리키는 버킷 객체의 주소를 알아낸다.
    //for (int i = 0; i < (index-1) ; i++ ) {
    for (int i = 1; i < index ; i++ ) {  
      cursor = cursor.next;
    }

    temp.next = cursor.next;
    cursor.next = temp;
    
  
  } 


  public int size() {
    return /*this.*/length; //인스턴스 주소 생략
  }

   public Object get(int index) {
     if (index < 0 || index > length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     Bucket cursor = start;
     
     for (int i = 0; i < index ; i++ ) {
       cursor = cursor.next;
     }
     return cursor.value;
   }
     
   
   
   public Object remove(int index) {
   
     if (index < 0 || index >= length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     
     length--;
     
     if (index == 0) {
       Bucket temp = start;
       start = start.next;
       return temp;
     }
     
     Bucket cursor = start;
     
     for (int i = 1; i < index ; i++ ) {  
       cursor = cursor.next;
     }
     
    Bucket removedObj = cursor.next;
    cursor.next = cursor.next.next;
    return removedObj.value;
   }
   
   
   public Object set(int index, Object obj) {
   
     if (index < 0 || index >= length) {
       throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다.");
     }
     
     Bucket cursor = start;
     
     for (int i = 0; i < index ; i++ ) {
       cursor = cursor.next;
     }
  
     Object oldValue = cursor.value;
     cursor.value = obj;
     
     return oldValue;
   }
}
