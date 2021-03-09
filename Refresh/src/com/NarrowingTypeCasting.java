package com;

public class NarrowingTypeCasting {

    public static void main(String[] args){
        char myChar = 'a';
        double d1 = 10.034;
        double myDouble = (double) myChar;
        int myInt = (int) myDouble;
        short myShort = (short) myInt;
        int I1 = (int) d1;
        byte b1 = (byte) d1;
        System.out.println(myDouble);
        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(I1);
        System.out.println(b1);
    }
}
