import java.util.Arrays;

public class BinarySearch {
    private int binarySearch(int[] searchArray, int startIndex, int endIndex, int searchNumber){
       if (startIndex <= endIndex){
            int midIndex = startIndex + (endIndex-startIndex) / 2;
            if (searchArray[midIndex]== searchNumber){
                return midIndex;
            }
            else if (searchArray[midIndex] > searchNumber){
                return binarySearch(searchArray,startIndex, midIndex-1, searchNumber);
            }
            else{
                return binarySearch(searchArray, midIndex+1, endIndex, searchNumber);
            }
        }
        else {
            return -1;
        }
    }
    public static void main (String[] args){
        int [] myIntArray= {0,-1,3,4};  //0-2
        Arrays.sort(myIntArray); //{-1.0.3}
        int startIndex = 0;  //0
        int endIndex = myIntArray.length-1;  //2
        int searchNumber = 4;
        BinarySearch bs= new BinarySearch();
        int returnIndex = bs.binarySearch(myIntArray,startIndex, endIndex,searchNumber); //{-1.0.3}, start : 0, end : 2, search : 3
        if (returnIndex>=0){
            System.out.println("Found at index " + returnIndex );
        }else {
            System.out.println("Not Found");
        }
    }
}
