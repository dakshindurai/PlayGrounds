package com;

public class StringToIntegerConversion {
    /*
    Break the String in to String Array
    Create a Int Array, and element by using Integer/parseInt(String Array)
     */
    static String myString = "987654";    // static variable
    String st1;
    public static void main(String[] args){
        System.out.println("Main method");
        StringToIntegerConversion s1 = new StringToIntegerConversion();
        s1.ConvertStrtoInt(myString);

    }
    public void ConvertStrtoInt(String myString){
        /*
        Convert String to String Array
         */
        String[] myStringArray = myString.split("");
        int [] myIntArray = new int[myStringArray.length];
        for (int i=0; i<myStringArray.length;i++){
            myIntArray[i] = Integer.parseInt(myStringArray[i]);
            System.out.println(myIntArray[i]);
        }
    }
}
