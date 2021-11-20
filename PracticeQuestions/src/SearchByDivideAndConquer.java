public class SearchByDivideAndConquer {
    //sort method for the array
    private int[] sortArray(int[] unSortedArray, int startIndex, int endIndex){
        int tempValue;
        for (int i=startIndex; i<=endIndex; i++){
            for (int j=i+1;j<=endIndex; j++ ){
                if (unSortedArray[i] > unSortedArray[j]){
                    tempValue = unSortedArray[i];
                    unSortedArray[i]= unSortedArray[j];
                    unSortedArray[j]=tempValue;
                }
            }
        }
        return unSortedArray;
    }
    private void displayArray(int[] sortedArray,int endIndex){
        System.out.print("Array is : ");
        for (int i=0; i<=endIndex; i++){
            if (i != endIndex) {
                System.out.print(sortedArray[i] + ",");
            }else{
                System.out.print(sortedArray[i]);
            }
        }
        System.out.println();
    }
    private void searchArray(int[] sortedArray, int startIndex, int endIndex, int findNumber){
        if (startIndex<=endIndex){
            if (sortedArray[startIndex]==findNumber){
                System.out.println("Found");
            }else {
                startIndex= startIndex+1;
                searchArray(sortedArray, startIndex, endIndex, findNumber);
            }

        }else {
            System.out.println("NOT Found");
        }
    }
    private void divideandSearch(int[] sortedArray, int startIndex, int endIndex, int findNumber){
        if (startIndex<=endIndex){
            int midIndex = startIndex + (endIndex-startIndex)/2;
            if (sortedArray[midIndex]==findNumber){
                System.out.println("Found");
            } else if (sortedArray[midIndex]<findNumber)
            {
                divideandSearch(sortedArray,midIndex+1, endIndex,findNumber);
            }else {
                divideandSearch(sortedArray, startIndex,midIndex-1,findNumber);
            }

        }else {
            System.out.println("Not Found");
        }

    }
    private void testCase (int[] unSortedArray, int findNumber){
        int startIndex=0;
        int endIndex = unSortedArray.length-1;
        SearchByDivideAndConquer obj = new SearchByDivideAndConquer();
        int sortedArray[] = obj.sortArray(unSortedArray, startIndex, endIndex);
        //Display the sorted array
        obj.displayArray(sortedArray,endIndex);
        System.out.println("Search for : "+ findNumber);
        //Search for the string in the array with normal iteration
        System.out.print("Complete Array Search Method Results : ");
        obj.searchArray(sortedArray, startIndex, endIndex, findNumber);
        System.out.print("Divide and Conquer Array Search Method Results :  ");
        obj.divideandSearch(sortedArray, startIndex, endIndex, findNumber);

    }
    public static void main(String[] args){
        SearchByDivideAndConquer obj = new SearchByDivideAndConquer();
        obj.testCase(new int[]{20, -3, 4, 1, 0, 201, 2}, -3);
        obj.testCase(new int[]{3},3);
        obj.testCase(new int[]{-3},3);
        obj.testCase(new int[]{},3);
        obj.testCase(new int[]{200, -30, 40, 20, 0, -34, -45 , 3, 30}, 30);

    }
}