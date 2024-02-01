public class JumpStatementDemo {
    //break will skip the remaining portion of code and break the loop execution
    //continue will skip the remaining portion of code and continue the loop execution
    static JumpStatementDemo jsdObj = new JumpStatementDemo();
    public static void main(String[] args){
        jsdObj.testCase();
    }
    public void testRun(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                if(i==j){
                    System.out.println(i +","+j);
                    break;
                }
            }
        }
        for (int i=0; i<10; i++){
            if (i%2==0){
                System.out.print( i+ " ");
                continue;
            }

        }
        boolean t = false;
        if (t) {
            System.out.println();
            System.out.println("Before return statement ");
            return;
        }
        System.out.println("After return statement ");
    }
    public void testCase(){
        jsdObj.testRun();
    }
}
