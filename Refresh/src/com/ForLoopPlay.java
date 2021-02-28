package com;

public class ForLoopPlay {
    public static void main(String[] args){
        /*
        For loop to iterate the operation, it involves Initialization, termination control, increment / derement
         */
        for (int i=0; i<5; i++)
            System.out.println("Iterated for " + i);
            System.out.println("end");

        System.out.println();
        /* Can also be written as below form */
        int i = 0;
        for (; i<5; i++){
            System.out.println("Iterated for " + i);
        }
        System.out.println();
        int k = 0;
        for (; ; k++){
            if (k < 5){
                System.out.println("Iterated for " + k);
            }else{
                break;
            }
        }
    }
}
