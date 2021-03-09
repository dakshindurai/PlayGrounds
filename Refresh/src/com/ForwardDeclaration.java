package com;

public class ForwardDeclaration {
    public static void main(String[] args){
        test t1 = new test();
        System.out.println("Test");
        System.out.println(t1.myClassMethod());
    }
}
class test {
    public int myClassMethod(){
        int a = 6;
        System.out.println("The Value of a "+ a);
        return 10;
    }
}

