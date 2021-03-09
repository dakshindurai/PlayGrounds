package com;

public class NullUnderstanding {
    static String myTestString = null;
    public static void main(String[] args){
       // Object obj1 = null;
        System.out.println(myTestString);
        if (myTestString==null){
            System.out.println("myString is null");
          //  System.out.println(i);
        }
    }
}
