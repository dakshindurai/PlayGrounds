package com;

public class StringToStringArray {
    public static void main(String[] args) {
        String myString = "Durai";
        StringToStringArray st1 = new StringToStringArray();
        st1.myStringToStringArray(myString);
        int i = 10_00_000;
        System.out.println(i);
    }

    private void myStringToStringArray(String myString) {
        String[] myStringArray;
        myStringArray = myString.split("");
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
    }
}
