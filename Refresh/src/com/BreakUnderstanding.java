package com;

public class BreakUnderstanding {
    public static void main(String[] args){
        for (int i=0;i <10; i++){
            System.out.println("The Value of i : " + i);
            for (int j=0; j < 20; j++){
                if (j == 0){
                    break;
                }
                System.out.println("The Value of j : "+ j);

            }
        }
    }
}
