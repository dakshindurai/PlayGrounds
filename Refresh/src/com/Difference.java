package com;

/*
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */

public class Difference {
    // Static Variable declaration
    static int givenNumber = -1;
    static int userNumber = -2;
    static int absoluteDifference;
    // Main to calculate the difference
    public static void main(String[] args){
        System.out.println("Start");
        absoluteDifference = differenceCalculate(givenNumber,userNumber);
        System.out.println(absoluteDifference);
    }
    //Method to Calculate
    public static int differenceCalculate(int givenNumber,int userNumber){
        if (givenNumber > userNumber ){
            absoluteDifference = givenNumber - userNumber;
        }else {
            absoluteDifference = (userNumber - givenNumber) * 2;
        }return absoluteDifference;
    }
}
