/*5월 23일
 * 멀티 태스킹
 * */
package step19;

public class Test01 {
  public static void main(String[] args) {
    //현재 메인 
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    
    //"main"쓰레드가 소속되어 있는 쓰레드 그룹
    ThreadGroup g = t.getThreadGroup();
    System.out.println(g.getName());
    
    //"main"그룹의 상위 스레드 그룹
    ThreadGroup g2 = g.getParent();
    System.out.println(g2.getName());
    //최상위 그룹=system
   
    
    //"system"그룹의 상위 스레드 그룹
    ThreadGroup g3 = g2.getParent(); //null
    //System.out.println(g3.getName());
    
    //"system"그룹의 하위 스레드 그룹
    System.out.println("----------------------");
    printThreadGroup(g2,   "");
  
 
  
  }
  
  
  static void printThreadGroup(ThreadGroup tg, String prefix) {
    //파라미터로 넘어온 쓰레드 그룹의 이름을 먼저 출력
    System.out.printf("%s['%s'] -- \n",prefix, tg.getName());
    
    //하위 쓰레드 그룹의 정보를 얻어서 출력한다.
    ThreadGroup[] groupArray = new ThreadGroup[10];
    int count = tg.enumerate(groupArray, false);  //false: 1단계 스레드 그룹만 알아내라
      for(int i = 0 ; i <count; i++) {
        printThreadGroup(groupArray[i], prefix + "  ");
      }
      Thread[] threadArray = new Thread[10];
      count = tg.enumerate(threadArray, false);
      for ( int i = 0; i < count ; i++) {
        System.out.printf("%s(%s)\n", prefix + "  ", threadArray[i].getName());
      }
  }
  
 
  }
  
  

