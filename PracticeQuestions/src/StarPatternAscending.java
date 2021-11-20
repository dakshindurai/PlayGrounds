/*
 *  *   *   *   *
 *  *   *   *
 *  *   *
 *  *
 *
 */

public class StarPatternAscending {
    private void patternGenerator (int patternLimit){
        for (int row=1; row<=patternLimit; row++){
            for(int col = 1; col <= row; col++){
                System.out.print ("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        StarPatternAscending obj = new StarPatternAscending();
        obj.patternGenerator(5);
        obj.patternGenerator(0);
        obj.patternGenerator(10);
    }
}
