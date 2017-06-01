/*5월 4일 목요일*/
/*변수 선언: 배열 응용 - 학생 성적 데이터 보관*/
package step02;

public class Test11 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순"};
    byte[][] scores = {{100, 100, 100}, {90, 90, 90}, {80, 80, 80}};
    short[] totals = {300, 270, 240};
    float[] aver = {100f, 90f, 80.0f};
    
    /*
    for(int i = 0; i < names.length ; i++) {
     for(int j = 0; j< scores[i].length; j++){
       for(int k = 0 ; k < totals.length; k++) {
           for(int z=0; z< aver.length; z++) {
             System.out.printf("이름: %s, " , names[i]);
             System.out.printf("국어: %d,  수학: %d, 영어: %d" , scores[i][j], scores[i][j], scores[i][j]);
             System.out.printf("총점 : %d", totals[k]);
           System.out.printf("평균 : %f\n", aver[z]);
         }
       }
    */
   
    for( int i = 0; i<3 ; i++){
     System.out.printf("%s, %d, %d, %d, %d, %f\n",  names[i], scores[i][0],scores[i][1], scores[i][2], totals[i], aver[i] );
     }
    
}
}
