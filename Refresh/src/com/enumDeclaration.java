package com;

public class enumDeclaration {
    enum Suit {
        DIMOND, SPADE, HEART, CLUBS
    }
    public static void main (String args[]){
        Suit s1 = Suit.DIMOND;
        Suit s2 = Suit.CLUBS;
        System.out.println(s1);
        System.out.println(s2);
    }
}
