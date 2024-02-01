public class BreakDemo {
    static BreakDemo myObject = new BreakDemo();
    public static void main(String[] args){
        myObject.testCaseData();
    }
    public void testExecution(int[] myInteger){
        for (int s: myInteger){
            if (s == 5){
                break;
            }
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 1;
        while (i < 10){
            System.out.print(i + " ");
            if (i ==5){
                break;
            }
            i++;
        }
        System.out.println();
        do {
            System.out.print(i);
            i++;
            if (i==5){
                break;
            }
        }while (i < 10);

    }
    public void testCaseData(){
        int myInteger[] = {2,4,5,7,9,10};
        //myObject.testExecution(myInteger);
        new BreakDemo().testExecution(myInteger);
    }
}
