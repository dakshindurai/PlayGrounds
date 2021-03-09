package com;

public class ReCursivePractice {
    public static void main(String[] args){
        int LoopCountBreaker = 0;
        int [] myIntegerArray = {3,2,5};
//        for(int i=0; i< myIntegerArray.length; i++){
//            System.out.println("Iteration "+ i);
//        }
        myRecursiveMethod(myIntegerArray, LoopCountBreaker);
    }
    public static int myRecursiveMethod(int[] myIntegerArray, int LoopCountBreaker){
        if (myIntegerArray.length-1 == LoopCountBreaker){
            System.out.print(myIntegerArray[LoopCountBreaker]);
            return 0;
        }else {
            System.out.print(myIntegerArray[LoopCountBreaker] + " ");
            LoopCountBreaker = LoopCountBreaker+1;
            return myRecursiveMethod(myIntegerArray, LoopCountBreaker);
        }

    }
}
