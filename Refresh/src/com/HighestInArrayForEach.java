package com;

public class HighestInArrayForEach {
    static int[] highestArray = {100, 200, 34,56,78,-12,0,100}; // Declaration
    static int highestNumber;
    public static void main(String[] args){ // Main Program
        HighestInArrayForEach obj1 = new HighestInArrayForEach();
        highestNumber= obj1.HighestNum(highestArray);
        System.out.println(highestNumber);
    }
    public int HighestNum(int[] highestArray){ // Method to Calculate Highest
        highestNumber= highestArray[0];
        if (highestArray.length>1){
            for(int highestTemp: highestArray){
                if (highestTemp > highestNumber){
                    highestNumber=highestTemp;
                }
            }
        }
        return highestNumber;
    }
}
