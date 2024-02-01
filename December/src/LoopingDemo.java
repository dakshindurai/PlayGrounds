import java.util.ArrayList;

public class LoopingDemo {
    static LoopingDemo loopObj = new LoopingDemo();
    public static void main(String[] args) {
        loopObj.testCase();
    }
    private void testRun(String executeCase){
        if (executeCase == "while"){
            //While Loop Demo
            int i = 0;
            while(i < 3){
                System.out.println("The value of i from While " + i);
                i++;
            }
        }else if (executeCase=="for"){
            for (int i=0; i < 3; i++){
                System.out.println("The value of i from FOR "+ i);
            }
            int x=0;
            for (int y=0, z=0; y<10 && x <1; y++, x++){
                System.out.println(y);
            }
            System.out.println("This is x value "+x);
        }else if (executeCase=="dowhile"){
            int i = 3;
            do{
                System.out.println("The value of i "+ i);
                i++;
            }while(i<5);
        }else if (executeCase=="enhancedFor"){
            byte[] myByteArray = {1,2,3,4,5};
            for (byte b1:myByteArray){
                System.out.print(b1);
            }
            System.out.println();
            for (int i =0; i<myByteArray.length; i++){
                System.out.print(myByteArray[i]);
            }
            System.out.println();
            int j=0;
            while (j < myByteArray.length){
                System.out.print(myByteArray[j]);
                j++;
            }
            System.out.println();
            int[] myInteger = new int[5];
            for (int i = 1; i <=myInteger.length-1; i++){
                myInteger[i] = i;
            }
           for (int intValues:myInteger){
               System.out.print(intValues);
           }
        }
    }
    //out of memory exception
    private void outException(){
        ArrayList<Integer> A1 = new ArrayList();
        for (int i=0; i<Integer.MAX_VALUE; i++){
            A1.add(i);
        }
    }
    private void testCase(){
        System.out.println();
       //  loopObj.testRun("while");
       //  loopObj.testRun("for");
       // loopObj.testRun("dowhile");
        loopObj.testRun("enhancedFor");
       // loopObj.outException();
    }
}


