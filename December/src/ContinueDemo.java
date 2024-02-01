public class ContinueDemo {
    static ContinueDemo obj = new ContinueDemo();
    public static void main(String[] args){
        obj.testCaseData();
    }
    private void testCaseExecution(){
        //continue example in for loop
        for (int i=0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.print(i + " ");
        }
        //continue example while loop
        System.out.println();
        int i = 0;
        while (i <10){
            if ( i == 5) {
                i++;
                continue;
            }
            System.out.print (i + " ");
            i++;
        }
        System.out.println();
        int j = 0;
        do {
            if (j==5){
                j++;
                continue;
            }
            System.out.print(j +  " ");
            j++;
        } while(j < 10);

    }
    private void testCaseData(){
        obj.testCaseExecution();
    }
}
