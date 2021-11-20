import java.util.Arrays;

public class SearchInArray {
    boolean numberFound = false;
    public boolean searchArray(int[] myIntArray, int searchFor, int startIndex, int endIndex ){
        if (startIndex==endIndex && myIntArray[startIndex]==searchFor){
            //System.out.println("Matched");
            numberFound = true;
            return numberFound;
        }else if(startIndex < endIndex){
            if (myIntArray[startIndex]== searchFor) {
                numberFound = true;
                return numberFound;
            }
                else{
                    startIndex = startIndex+1;
                    searchArray( myIntArray,  searchFor,  startIndex,  endIndex);
                }
            }
        else {
            return numberFound;
        }
        return numberFound;
    }
    public static void main(String[] args){
        int[] myIntArray = {9,3,-4,2,10, 4};
        int searchFor = 2;
        int startIndex= 0;
        int endIndex = myIntArray.length-1;
        Arrays.sort(myIntArray);
        SearchInArray s1 = new SearchInArray();
        boolean numberFound = s1.searchArray(myIntArray, searchFor, startIndex, endIndex);
        if (numberFound) {
            System.out.println("Number : " +searchFor + " found in the int array");
        }else{
            System.out.println("Searching number not found");
        }

    }
}
