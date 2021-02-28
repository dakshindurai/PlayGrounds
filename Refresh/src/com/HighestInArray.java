package com;

public class HighestInArray {
    static int HighestNumber;
    static int[] myIntegerArray = {-1,0,-2}; // Input
    public static void main(String[] args){  // Main
        HighestNumber = HighestNum (myIntegerArray);
        System.out.println("The Highest Number " + HighestNumber );
    }
    public static int HighestNum(int[] myIntegerArray){ // Calculate Highest Integer in an array
        HighestNumber = myIntegerArray[0];
        if (myIntegerArray.length>1) {
            System.out.println("Array has many elements");
            for(int i=0; i<myIntegerArray.length;i++){
                if (myIntegerArray[i] > HighestNumber){
                    HighestNumber = myIntegerArray[i];
                }
            }
        }
        return HighestNumber;
    }
}
