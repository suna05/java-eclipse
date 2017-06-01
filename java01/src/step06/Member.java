package step06;

/*Test02_3.java에 있던 성적 처리 관련 클래스를 분리하였다. */
/**/
class Member {
  //init(), compute(), print()메서드에서 사용할 변수 선언
    static String name;
    static int[] scores = new int[3];
    static int total;
    static float aver;
  
    public static void init(String n, int k, int e, int m) {
        name = n;
        scores[0] = k;
        scores[1] = e;
        scores[2] = m;
      }
    
    public static void compute() {
        total = scores[0] + scores[1] + scores[2];
        aver = total  / 3f;
      }
  
    public static void print() {
      System.out.printf("%s, %d, %d, %d, %d, %f\n", 
          name, scores[0], scores[1], scores[2], total, aver);
   }
}
