/* 유틸리티 클래스 : 같은 이름 다른 패키지
 * java.util.Date 클래스와 java.sql.Date 클래스 구분하기
 * => 날짜 데이터에서 년, 월, 일, 시, 분, 초를 추출하거나 설정하고 싶다면,
 *      calendar 클래스를 사용하라.
 *      기존
 */
package step08;

import java.util.Calendar;

public class Test05_7{
 
  public static void main(String[] args) {
    //Calendar 객체는 new 명령을 사용하여 직접 만들 수 없다.
    //getInstance() 메서드를 호출하여 그 리턴 값을 사용하라.
    Calendar cal = Calendar.getInstance();
    
    //날짜 정보 추출
    //cal.get(꺼낼 값을 숫자로 지정한다.);
    System.out.println(cal.get(1));
    System.out.println(cal.get(2) + 1);
    System.out.println(cal.get(5));
    System.out.println(cal.get(7));
    System.out.println(cal.get(10));
    System.out.println(cal.get(11));
    System.out.println(cal.get(12));
    System.out.println(cal.get(13));
  }

}
