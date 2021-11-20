/*
*   *   *   *   *  1-5
*   *   *   * 2-4
*   *   * 3-3
*   * 4-2
* 5-1
 */
public class StarPatternDescending {
    private void descendingPatternGenerator(int patternLimit){
        for (int row=1; row<=patternLimit; row++){
            for (int col=1; col<=patternLimit-row+1; col++){ //
                System.out.print("*"+ "\t");
            }System.out.println();
        }
    }
    public static void main(String[] args){
        StarPatternDescending obj = new StarPatternDescending();
        obj.descendingPatternGenerator(10);


    }
}
