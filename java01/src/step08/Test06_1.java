/* 컬렉션 클래스 : 사용전 - 배열을 사용한다.
 * => 여러 개의 주소를 보관할 때 사용하는 클래스
 * => 배열을 이용하면 
 */
package step08;

import java.sql.Date;

public class Test06_1{
 
  public static void main(String[] args) {
    //Date인스턴스를 최대 3개 저장할 수 있다.
    Object[] dateList = new Object[3];
    //주소를 저장할 레퍼런스를 3개 만들어라. []: 레퍼런스 배열을 몇개 만들어야 하는지.
    
    dateList[0] = Date.valueOf("2017-3-1");
    dateList[1] = Date.valueOf("2017-5-3");
    dateList[2] = Date.valueOf("2017-5-5");
    
    
    //배열의 문제는 인스턴스를 배열 크기 만큼만 저장할 수 있다.
    //더 추가로 저장하고 싶다면, 새 배열을 만들어야 한다.
    //관리하기 너무 번거롭다.
    //해결책? 인스턴스 목록을 전문적으로 관리해주는 클래스(컬렉션 클래스)를 사용하라.
    dateList = growArray(dateList, 2);
    
    dateList[3] = Date.valueOf("2017-5-9");
    dateList[4] = Date.valueOf("2017-6-6");
    
    for (Object obj : dateList) {
      System.out.println(obj);
    }
  }
  
  public static Object[] growArray(Object[] arr, int size) {
    Object[] newArr = new Object[arr.length + size];
    for (int i = 0; i<arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

}
