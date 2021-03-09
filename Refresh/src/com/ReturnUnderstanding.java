package com;

public class ReturnUnderstanding {
    static int i;
    public static void main(String[] args){
        ReturnUnderstanding obj1 = new ReturnUnderstanding();
        obj1.CallMethod(10);
        System.out.println("Main Method");
    }
    public void CallMethod(int i){
        this.i=i;
        System.out.println("Method getting called");
        if (i==10){
            return;
        }
        System.out.println("Method getting ended");

    }
}
