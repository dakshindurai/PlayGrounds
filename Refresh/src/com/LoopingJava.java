package com;

public class LoopingJava {
    public static void main(String[] args){
        {
            {
                int i = 25;
                System.out.println("The Value of I "+ i);
                {
                    i = 15;
                    System.out.println("The Value of I is modified to "+ i);
                    i = 25;
                    System.out.println("The Value of I is again reverted to "+ i);
                }
            }
        }

    }
}
