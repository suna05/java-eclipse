/*제너릭 문법: 사용 후
 * 
 * */

package step14;

//
public class Bucket2<T> {
  T value;
  
  public void setValue(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return value;
  }
}
