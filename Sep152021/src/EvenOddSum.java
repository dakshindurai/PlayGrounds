public class EvenOddSum {
    int eventSum= 0;
    int oddSum=0;
    public int getEvenSum(int givenNumber){
        if (givenNumber >=0) {
            for(int i=1; i<=givenNumber;i++){
                if(i%2==0){
                    eventSum = eventSum+i;
                }
            }
        }else {
            System.out.println("input is not a whole number");
        }
        return eventSum;

    }
    public int getOddSum(int givenNumber){
        if (givenNumber>=0){
        for (int j=1; j<givenNumber; j++){
            if(j%2!=0){
                oddSum = oddSum+j;
            }
        }
        }else{
            System.out.println("input is not a whole number");
        }
        return oddSum;
    }
    public static void main(String[] args){
        EvenOddSum obj1 = new EvenOddSum();
       //int eventSum = obj1.getEvenSum(-10);
       int eventSum = obj1.getEvenSum(0);
       //int eventSum = obj1.getEvenSum(10);
        int oddSum = obj1.getOddSum(4);
        System.out.println("Event Of Sum " + eventSum);
        System.out.println("Odd Of Sum "+ oddSum);
    }
}
