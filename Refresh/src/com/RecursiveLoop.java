package com;

public class RecursiveLoop {
    public static int myMethod(int myNumber){
        if (myNumber==4){
            System.out.println("function call going to end");
            return myNumber;
        }else {
            System.out.println("The Value of Number " + myNumber);
            myNumber = myNumber+1;
            return myMethod(myNumber);
        }
    }
    public static void main(String[] args){
        int myNumber = 1;
        int myNewNumber;
        myNewNumber = myMethod(myNumber); // recursive function running on a multiple iteration
        System.out.println(myNewNumber);
        for (int i=0; i<4; i++){
            System.out.println("The Value of Number "+i);
        }
    }
}
