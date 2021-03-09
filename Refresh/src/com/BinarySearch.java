package com;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] myIntegerArray = {100,1,3,5,7,9,11,13};
        Arrays.sort(myIntegerArray);
        int searchNumber = 100;
        int startIndex =0;
        int endIndex = myIntegerArray.length-1;
        int returnIndex;
        returnIndex = binarySearch(myIntegerArray, startIndex, endIndex, searchNumber);
        if (returnIndex==-1) {
            System.out.println("Searching number does not exist in Array");
        }else {
            System.out.println("Searching number found at index "+ returnIndex);
        }
    }
    public static int binarySearch(int[] myIntegerArray, int startIndex, int endIndex,int searchNumber){
        int midIndex = startIndex + (endIndex - startIndex)/2;
        if (midIndex <= endIndex) {
            if (myIntegerArray[midIndex] == searchNumber) {
                return midIndex;
         }
            else if (myIntegerArray[midIndex] < searchNumber){
                return binarySearch (myIntegerArray, midIndex+1 , endIndex, searchNumber);
            }
            else
                return binarySearch(myIntegerArray, startIndex, midIndex - 1, searchNumber);
        }else
            return -1;
    }
}
