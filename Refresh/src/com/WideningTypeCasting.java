package com;

public class WideningTypeCasting {
    public static void main(String[] args){
        byte myByte = 100;
        short myShort = myByte;
        int myInteger = myByte;
        float myFloat = myByte;
        float myFloat1 = myInteger;
        double myDouble = myFloat;
        System.out.println("my Byte "+ myByte);
        System.out.println("my Short "+ myShort);
        System.out.println("my Integer "+ myInteger);
        System.out.println("my Float "+ myFloat);
        System.out.println("my Float1 "+ myFloat1);
        System.out.println("my Double "+ myDouble);
    }
}
