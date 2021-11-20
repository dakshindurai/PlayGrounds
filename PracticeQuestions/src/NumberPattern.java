/*
    *
    * *
    * * *
    * * * *
    * * * * *
 */

public class NumberPattern {
    private void patternGenerator(int patternLimit){
        for (int row=1; row<= patternLimit; row++){
            for (int col=1; col <=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       NumberPattern obj = new NumberPattern();
       //obj.patternGenerator(3);
       obj.patternGenerator(10);
    }

}
