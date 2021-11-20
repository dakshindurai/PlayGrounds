public class EvenOddSumFunction {
    int sum=0;
    public int getEvenSum(int startIndex, int upToNum){
        if (startIndex==upToNum && startIndex%2==0){
            sum = sum + startIndex;
            return sum;
        }else if (startIndex < upToNum){
            if (startIndex %2 ==0){
                sum = sum + startIndex;
            }
            startIndex = startIndex+1;
            getEvenSum(startIndex, upToNum);
        }
        return sum;
    }
//    public int getOddSum(int startIndex, upToNum){
//        if(startIndex==upToNum){
//
//        }
//    }
    public static void main(String[] args){
        System.out.println("Find the sum of all Natural Numbers up to 10");
        EvenOddSumFunction obj1 = new EvenOddSumFunction();
        int sum = obj1.getEvenSum(0,11);
        System.out.println(sum);
    }
}
