public class ArraySortAndSearch {
    boolean numberFound = false;
    private int[] sortArray(int[] unsortedArray){
        //Function to sort the unsortedArray
        for (int i=0; i<unsortedArray.length; i++){
            int temp =0;
            for (int j=i+1; j<unsortedArray.length; j++){
                if (unsortedArray[i] > unsortedArray[j]){
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j]=temp;
                }
            }
        }
        return unsortedArray;
    }
    private void displayArray(int[] sortedArray){
        for (int i=0; i< sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }
    private boolean searchArray(int[] sortedArray, int startIndex, int endIndex, int searchInt){
        if (startIndex<=endIndex){
            if (sortedArray[startIndex]==searchInt){
                numberFound=true;
                return numberFound;
            }else{
                startIndex= startIndex+1;
                searchArray(sortedArray,startIndex,endIndex,searchInt);
            }

        }else {
            return numberFound;
        }return numberFound;
    }
    public static void main(String[] args){
        int[] unsortedArray = {22,-10,-30, 100, 3, 50, 78, 20,200};
        //int[] unsortedArray = {22};
        ArraySortAndSearch s1 = new ArraySortAndSearch();
        int[] sortedArray= s1.sortArray(unsortedArray);
        s1.displayArray(sortedArray);
        int startIndex = 0;
        int endIndex = sortedArray.length-1;
        int searchInt = 202;
        System.out.println();
        boolean numberFound = s1.searchArray(sortedArray, startIndex, endIndex, searchInt);
        if (numberFound){
            System.out.println("FOUND");
        }else {
            System.out.println("Searching number NOT found in the Array");
        }
    }

}
