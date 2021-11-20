import java.util.Arrays;
public class ArrayBinarySearch {
    public static void displaySortedArray(int[] myArray, int startIndex){
         if (startIndex<myArray.length){
            System.out.print(myArray[startIndex]+ " ");
            startIndex = startIndex+1;
            displaySortedArray (myArray, startIndex);
        }else {
             System.out.println();
             return;
         }
    }
    public static int searchArray(int[] myArray, int searchIndex){
        int resultIndex = Arrays.binarySearch(myArray,searchIndex);
        return resultIndex;
    }
    public static void main(String[] args){
        int searchValue = 34;
        int[] myArray = {23,34,12,23,123};
        Arrays.sort(myArray);
        displaySortedArray(myArray, 0);
        int resultIndex = searchArray(myArray,searchValue);
        if (resultIndex>0 || resultIndex==0){
            System.out.println("Element exist");
        }else {
            System.out.println("Element does not exist");
        }
    }
}
