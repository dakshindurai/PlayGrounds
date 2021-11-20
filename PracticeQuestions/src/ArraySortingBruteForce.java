public class ArraySortingBruteForce {
    private int[] sortAscending(int[] arraytoSort){
        for (int i=0; i < arraytoSort.length; i++){
            int temp =0;
            for (int j=i+1; j< arraytoSort.length; j++){
                if (arraytoSort[i] > arraytoSort[j]){
                    temp = arraytoSort[i];
                    arraytoSort[i]= arraytoSort[j];
                    arraytoSort[j]= temp;
                }
            }
        } return arraytoSort;

    }
    private int[] sortDescending(int[] unsortedArray){
        for (int i = 0; i < unsortedArray.length; i++){
            int temp1 = 0;
            for (int j= i+1; j < unsortedArray.length; j++){
                if (unsortedArray[i]<unsortedArray[j]){
                    temp1 = unsortedArray[i];
                    unsortedArray[i]= unsortedArray[j];
                    unsortedArray[j]= temp1;
                }
            }
        }
        return unsortedArray;
    }
    private void displayArray(int[] sortedArray){
        for(int i=0; i <sortedArray.length; i++){
            if (i != sortedArray.length-1){ //0-6
                System.out.print(sortedArray[i]+",");
            }
            else {
                System.out.print(sortedArray[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] unsortedArray = {0,-2,-3,20,34,2,45,5};
        ArraySortingBruteForce asb = new ArraySortingBruteForce();
        int[] sortedAscendingArray = asb.sortAscending(unsortedArray);
        System.out.print("Ascending Sort => ");
        asb.displayArray(sortedAscendingArray);
        System.out.println();
        int[] sortedDescendingArray = asb.sortDescending(unsortedArray);
        System.out.print("Descending Sort => ");
        asb.displayArray( sortedDescendingArray);
    }
}
