package com;

public class VariableScope
{
    int myInstanceInteger; // Instance Variable or non-static variable
    static int myStaticInteger; // Non-Static Variable
    public static void main(String[] args){
        VariableScope v1 = new VariableScope();
        v1.myMethod();
        v1.myInstanceInteger=10;
        VariableScope.myStaticInteger=100;
        System.out.println("The Instance Variable value is "+v1.myInstanceInteger);
        System.out.println("The Static Variable value is "+ VariableScope.myStaticInteger);
    }
    public void myMethod(){
        int myMethodVariable; // local variable
        myMethodVariable = 10;
        System.out.println("The Local Variable value is " + myMethodVariable);
    }
}
