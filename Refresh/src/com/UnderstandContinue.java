package com;

public class UnderstandContinue {
    public static void main(String[] args){
        int upTo = 100;
        String EvenOrOdd = "Odd";
        for (int i=0; i<upTo; i++){
            if (EvenOrOdd== "Even"){
                if (i%2 !=0){
                    continue;
                }
                System.out.print(i+ " ");
            }else {
                if (i%2==0){
                    continue;
                }
                System.out.print (i + " ");
            }

        }
    }
}
