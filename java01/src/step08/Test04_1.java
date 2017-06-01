/* 유틸리티 클래스 : 랩퍼(wrapper) 클래스
 * => 자바의 원시 데이터 타입(primitive type)을 다루는 클래스를 말한다.
 * => byte --> java.lang.Byte
 *      short --> java.lang.Short
 *      int --> java.lang.Integer
 *      long --> java.lang.Long
 *      float --> java.lang.Float
 *      double --> java.lang.Double
 *      boolean -->
 * =>
 * 
 */
package step08;

public class Test04_1 /*extends Object*/{
 
  public static void main(String[] args) {
    int i = 10;
    Integer obj = new Integer(10);
    
    int x = obj.intValue();
    
    String str = obj.toString();
    
    //int 값을 다양한 타입의 값으로 뽑아내는 기능도 있다.
    byte b = obj.byteValue();
    short s = obj.shortValue();
    long l = obj.longValue();
    float f = obj.floatValue();
    double d = obj.doubleValue();
    
    //두 수의 크기를 비교하는 기능도 있다.
    
    System.out.println(obj.compareTo(new Integer(5)));
    System.out.println(obj.compareTo(new Integer(10)));
    System.out.println(obj.compareTo(new Integer(20)));
  }

}
