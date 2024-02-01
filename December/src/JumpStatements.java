public class JumpStatements {
    static JumpStatements obj = new JumpStatements();
    public static void main(String[] args){

        obj.testCase();
    }
    public void testRun(String JumpExample){
        if (JumpExample== "break"){
            for(int i=0; i<10;i++ ){
                if (i==5){
                    break;
                }
                System.out.println("The value of Break i " + i);
            }
        }
        else if (JumpExample=="continue"){
            for (int i=0; i<10; i++){
                if (i%2 ==0){
                    continue;
                }else {
                    System.out.println("Odd Number "+ i);
                }
            }
        }
        else if (JumpExample=="return"){

        }


    }
    public void testCase(){
        obj.testRun("break");
        obj.testRun("continue");
        obj.testRun("return");
    }
}
