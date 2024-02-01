/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
nums = [2,7,11,15], target = 9
o/p [0,1]
 */
public class TwoSum {
    private void testResultPosition(int i, int j){
       System.out.print("[" +i + ","+ j+"]"  );
    }
    private void testResult(String i, String j){
        System.out.print("[" +i + ","+ j+"]"  );
    }
    private void testExecution(int sum, int[] myArray){
        TwoSum obj = new TwoSum();
        for (int i=0; i <myArray.length; i++){
            for (int j = i+1; j<myArray.length; j++){
                if (myArray[i]+ myArray[j]== sum && i != j ){
                    obj.testResultPosition(i,j);
                    //obj.testResult(" ==> " + myArray[i] + "," + myArray[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        System.out.println("Test case 1 :");
        obj.testExecution(10, new int[]{1,2,4,5,6,7,8});
        System.out.println();
        System.out.println("Test case 2 :");
        obj.testExecution(20, new int[]{13,2,7,19,1,9,11,0,3,4,5});
        System.out.println();
        System.out.println("Test case 3 :");
        obj.testExecution(9, new int[]{2,7,11,15});
        System.out.println();
    }
}
