package com;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){
        int startIndex =0;
        byte[] nunbersByteArray = {-1,3,2,10,20,-4};
        short[] numbersShortArray = {-1,3,2,10,20,-4};
        int[] numbersIntArray = {34,45,12,-1,0,8};
        long[] numbersLongArray = {100000, 2000,10000000};
        double[] numberDoubleArray = {10.02,10.03,1.23,3.45};
        float[] numberFloatArray = {10.2f, 20.23f, 1.34f};
        char[] myCharArray = {'c', 'e', 'a', 'f','q'};
        String[] myStringArray = {"Durai", "Murugan", "Abinandhan","Bala"};
        Arrays.sort(nunbersByteArray);
        displayByteArray(nunbersByteArray, nunbersByteArray.length, startIndex);
        System.out.println();
        Arrays.sort(numbersShortArray);
        for (int i=0; i < numbersShortArray.length; i++){
            System.out.print(numbersShortArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(numbersIntArray);
        for (int i=0; i < numbersIntArray.length; i++){
            System.out.print(numbersIntArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(numbersLongArray);
        for (int i=0; i < numbersLongArray.length; i++){
            System.out.print(numbersLongArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(numberDoubleArray);
        for (int i=0; i < numberDoubleArray.length; i++){
            System.out.print(numberDoubleArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(numberFloatArray);
        for (int i=0; i < numberFloatArray.length; i++){
            System.out.print(numberFloatArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(myCharArray);
        for (int i=0; i < myCharArray.length; i++){
            System.out.print(myCharArray[i] + " " );
        }
        System.out.println();
        Arrays.sort(myStringArray);
        for (int i=0; i < myStringArray.length; i++){
            System.out.print(myStringArray[i] + " " );
        }
    }
    public static int displayByteArray(byte[] nunbersByteArray, int ArrayLength, int startIndex){
        if (ArrayLength - 1 == startIndex) {
            System.out.print(nunbersByteArray[startIndex]);
            return 1;
        }
        System.out.print(nunbersByteArray[startIndex] + " ");
        startIndex = startIndex+1;
        int i = displayByteArray(nunbersByteArray, ArrayLength, startIndex);
        return i;
    }
}
