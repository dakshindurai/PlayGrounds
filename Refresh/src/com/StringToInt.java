package com;

public class StringToInt {
    public static void main(String[] args) {
        String myString = "987654321";
        String TestString = "Hi I am your friend";
        String[] myStringArray = myString.split("");
        int[] convertedIntArray = new int[myStringArray.length];
        for(int i=0; i< myStringArray.length; i++){
            convertedIntArray[i] = Integer.parseInt(myStringArray[i]);
            System.out.print(convertedIntArray[i] + " ");
        }
        String[] myTestStringArray = TestString.split(" ");
        for(int i = 0; i < myTestStringArray.length;i++){
            System.out.print(myTestStringArray[i]);
        }
    }
}

