package com;

public class StudentMarjs {
    public static void main(String arga[]){
        InstanceVariable It1 = new InstanceVariable();
        It1.engMarks = 10;
        System.out.println("Mark of First Object");
        System.out.println(It1.engMarks);
        InstanceVariable It2 = new InstanceVariable();
        It2.engMarks = 100;
        System.out.println("Mark of Second Object");
        System.out.println(It2.engMarks);
        StaticVariable.myStaticInteger = 101;
        StaticVariable.myStaticInteger = 102;
        System.out.println(StaticVariable.myStaticInteger);

    }
}
