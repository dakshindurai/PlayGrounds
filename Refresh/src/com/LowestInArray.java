package com;

public class LowestInArray {
    static int[] LowestArray = {-2, 1,3,5,7,0,-1};  // Declare the array
    int LowestNumber;
    public static void main(String[] args){ // Main
        LowestInArray l1 = new LowestInArray();
        l1.LowestNumber = CalculateLowest(LowestArray);
        System.out.println("The Lowest Number is  " + l1.LowestNumber);
    }
    public static int CalculateLowest(int[] LowestArray){ //Method to calculate lowest
        LowestInArray l1 = new LowestInArray();
        l1.LowestNumber = LowestArray[0];
        if (LowestArray.length>1){
            System.out.println("Many Elements in Array");
            for (int i=0; i<LowestArray.length;i++){
                if (LowestArray[i]< l1.LowestNumber){
                    l1.LowestNumber = LowestArray[i];
                }
            }
        }
        return l1.LowestNumber;
    }
}
