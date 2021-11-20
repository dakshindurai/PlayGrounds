public class LoopReplace {
    public static void main(String[] args){
        int startIndex=-1;
        int endIndex=0;
        //for loop
//        for(int i=startIndex; i<endIndex; i++){
//            System.out.println("Iterating at the position "+ i);
//        }
        LessThanOREqualTo(startIndex, endIndex);
        LessThan(startIndex, endIndex);
        ReverseLoopLTOE(startIndex, endIndex);
        ReverseLT(startIndex, endIndex);
    }
    public static void LessThanOREqualTo(int startIndex, int endIndex){
        //if lessthan or equalto execute
        if (startIndex < endIndex){
            System.out.println("Iterating LessThanOrEqualto at the position "+ startIndex);
            startIndex = startIndex + 1;
        }else if (startIndex==endIndex){
            System.out.println("Iterating LessThanOrEqualto at the position "+ startIndex);
            return;
        }
        LessThanOREqualTo(startIndex, endIndex);
    }
    public static void LessThan(int startIndex, int endIndex){
        // lessthan execute
        if(startIndex < endIndex){
            System.out.println("Iteration Lessthan at the position "+ startIndex);
            startIndex = startIndex + 1;
        }else if (startIndex==endIndex){
            return;
        }
        LessThan(startIndex, endIndex);
    }
    public static void ReverseLoopLTOE(int startIndex, int endIndex){
        if (endIndex > startIndex){
            System.out.println("Reverse Iteration LessThanOrEqualto at the position "+ endIndex);
            endIndex = endIndex -1;
        }else if (endIndex == startIndex){
            System.out.println("Reverse Iteration LessThanOrEqualto at the position "+ endIndex);
            return;
        }
        ReverseLoopLTOE(startIndex, endIndex);
    }
    public static void ReverseLT(int startIndex, int endIndex){
        if (endIndex > startIndex){
            System.out.println("Reverse Iteration LessThan at the position "+ endIndex);
            endIndex = endIndex -1 ;
        }else if (endIndex == startIndex){
            return;
        }ReverseLT(startIndex, endIndex);
    }
}
