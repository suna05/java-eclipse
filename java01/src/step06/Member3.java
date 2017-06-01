package step06;

/*메서드에서 static을 떼어내어 인스턴스를 다루는 메서드로 만든다. */
/**/
class Member3 {
  //init(), compute(), print()메서드에서 사용할 변수 선언
    String name;
    int[] scores = new int[3];
    int total;
    float aver;
  
    
    public void init(String name, int kor, int eng, int math) {
        this.name = name;
        this.scores[0] = kor;
        this.scores[1] = eng;
        this.scores[2] = math;
      }
    
    public void compute() {
      this.total = this.scores[0] + this.scores[1] + this.scores[2];
      this.aver = this.total  / 3f;
      }
  
    public void print() {
      System.out.printf("%s, %d, %d, %d, %d, %f\n", 
          this.name, this.scores[0], this.scores[1], this.scores[2], this.total, this.aver);
   }
}
