public class HighestInArray {
    static HighestInArray obj = new HighestInArray();
    public static void main(String[] args){
        obj.testCase();
    }
    private void testExecution(int[] myIntegerArray){
        int maxSoFar = myIntegerArray[0];
        for (int highest:myIntegerArray){
            if (highest > maxSoFar){
                maxSoFar = highest;
            }
        }
        System.out.println(maxSoFar);
    }
    private void testCase(){
        int[] testcase1 = {2,2,2, 2, 2};
        int[] testcase2 = {-1,2,3,-4,5};
        int[] testcase3 = {-1,20,-3,-4,15};
        obj.testExecution(testcase1);
        obj.testExecution(testcase2);
        obj.testExecution(testcase3);
    }
}
