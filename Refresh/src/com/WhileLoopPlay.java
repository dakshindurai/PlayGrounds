package com;

public class WhileLoopPlay{
    /*
    While loop checks the condition and executes the statements only if the condition is true.
    */
    public static void main(String[] args){
        int i = 1;
        while (i <= 5) {
            System.out.println("The value of i "+ i);
            i++;
        }
        while (i > 0){
            System.out.println("The value of i "+ i);
            i--;
        }
    }
}
