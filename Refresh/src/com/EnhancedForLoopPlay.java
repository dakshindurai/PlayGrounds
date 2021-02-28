package com;

public class EnhancedForLoopPlay {
    public static void main(String[] args){
        byte[] myByteArray = {10,20,30,40,50};
        String[] myStringArray = {"Apple", "Orange", "Lemon", "Grape","Cuties"};
        int[] myIntArray = {1,2,3,4,5,6};
        /*
        For Loop to iterate by array using the index
         */

        try {
            for(int i =0 ; i <= myByteArray.length; i++){
                System.out.println("The value of Index "+i +" in byteArray is  "+ myByteArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Quit Gracefully as the index out of range reached");
        }
        /*
        Enhanced for loop to iterate
         */
        for (byte myTempByte: myByteArray){
            System.out.println("The Value of byte elements " + myTempByte);
        }
        for (String myTempString: myStringArray){
            System.out.println("The Valye of String Elements "+ myTempString);
        }
        for (int myTempInt: myIntArray){
            System.out.println("The Value of Int Elements "+ myTempInt);
        }

    }
}
