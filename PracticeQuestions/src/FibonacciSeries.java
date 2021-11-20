public class FibonacciSeries {
    private void generateFibSeries(int firstNumber, int secondNumber, int fibUpTo){ //0,1,1,2,3,5,8
        if (fibUpTo != 0){
            if (fibUpTo !=1)
                System.out.print(firstNumber + " ");
            else{
                System.out.print(firstNumber );
            }
            int nextNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            fibUpTo--;
            generateFibSeries(firstNumber,secondNumber,fibUpTo);
        }
    }
    //Test Execution Method
    private void testCase(int fibUpTo){
        int firstNumber = 0;
        int secondNumber = 1;
        FibonacciSeries printObj = new FibonacciSeries();
        printObj.generateFibSeries(firstNumber, secondNumber, fibUpTo);
        System.out.println();

    }
    public static void main(String[] args){
        FibonacciSeries obj = new FibonacciSeries();
        obj.testCase(1);
        obj.testCase(2);
        obj.testCase(3);
        obj.testCase(4);
        obj.testCase(5);

    }
}
