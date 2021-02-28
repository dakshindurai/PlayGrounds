package com;

public class LocalVariableDeclaration {
    public void myMethod(){  //localVariable declared inside method, block, constructor
        int localIntVariable = 0;
        int localIntVariable2 = 100;
        localIntVariable = localIntVariable + 10;
        System.out.println(localIntVariable);
        System.out.println(localIntVariable2);
    }

    public static void main(String args[]) {
        LocalVariableDeclaration vObj = new LocalVariableDeclaration();
        vObj.myMethod();
    }
}
