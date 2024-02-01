/*

*
*   *
*   *   *
*   *
*

*/


public class TrianglePattern {
    private void printPattern(){
        System.out.print("* ");
    }
    private void testExecute(int test){
        TrianglePattern obj = new TrianglePattern();
       for (int row =1; row <=test; row ++){
           int midRow = test / 2 + 1;
           if (row <= midRow){
               for (int col =1; col<=row; col ++){
                   obj.printPattern();
               }
           }else {
               for (int col = test; col>= row; col--){
                   obj.printPattern();
               }
           }
           System.out.println();

       }
    }
    public static void main(String[] args){
        TrianglePattern obj = new TrianglePattern();
        obj.testExecute(23);
       // obj.testExecute(5);

    }
}
