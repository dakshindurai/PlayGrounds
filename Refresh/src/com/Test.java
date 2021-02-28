package com;

public class Test {
    static int x = 11;  // static variable
    public int y = 33;  // Instance variable
    static int i;
    Test (){
        int i = 10;
        System.out.println("Constructor getting called");
        System.out.println("Construction i "+ i);
    }
    public void method1(int x)
    {
        Test t = new Test();
        this.x = 22;
        y = 44; // local variable

//        System.out.println("Test.x: " + Test.x); // 22
//        System.out.println("t.x: " + t.x); // 22
//        System.out.println("t.y: " + t.y); //33
//        System.out.println("y: " + y); //44
    }

    public static void main(String args[])
    {
        Test t = new Test();
        {
            int i = 20;
            System.out.println("The value of I Loop4 " + i);
        }
        {
            int i = 5;
            System.out.println("The Value of I Loop1 " + i);

        }
        {
            int i = 10;
            System.out.println("The Value of I Loop2 " +i);
        }
        for (int i=15; i< 20 ;i=i+5){
            System.out.println("The Value of I Loop3 "+ i);

        }

//        System.out.println("t.y: " + t.y);   // 33
//        System.out.println("Test.x from main: " + Test.x);  // 11
        t.method1(5);
    }
}