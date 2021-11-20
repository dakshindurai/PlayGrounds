public class SumOfOddNaturalNumbers {
    int oddSum =0;
    public int getOddSum(int start, int upToNumber){
        if (start==upToNumber && start%2 !=0){
            oddSum = oddSum+ upToNumber;
            return oddSum;
        }else if (start < upToNumber){
            if (start%2 !=0){
                oddSum = oddSum + start;
            }
            start = start+1;
            getOddSum(start, upToNumber);
        }return  oddSum;
    }
    public static void main(String[] args){
        SumOfOddNaturalNumbers s1 = new SumOfOddNaturalNumbers();
        s1.oddSum = s1.getOddSum(1, 1);
        System.out.println("Sum of all Odd Numbers " + s1.oddSum);
    }
}
