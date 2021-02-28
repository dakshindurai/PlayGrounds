package com;

public class SamplePlayGround {
    int sampleInstance;
    public static void main(String args[]){
      methodA();
      IntanceVariable obj1 = new IntanceVariable();
      obj1.myInstanceVariable=20;
      System.out.println("my Instance Variable from object1 is "+ obj1.myInstanceVariable);
      IntanceVariable obj2 = new IntanceVariable();
      obj2.myInstanceVariable=30;
      System.out.println("my Instance Variable from object2 is  "+ obj2.myInstanceVariable);
      IntanceVariable.myStaticVariable=40;
      System.out.println("my Statuc Variable is "+ IntanceVariable.myStaticVariable);
      SamplePlayGround sj1 = new SamplePlayGround();
      sj1.sampleInstance=50;
      System.out.println("instance from Sample "+sj1.sampleInstance);
    }
    public static void methodA() {
        int myLocalInt =10;
        System.out.println("my Local Variable "+ myLocalInt);
    }

}
class IntanceVariable{
    int myInstanceVariable;
    static int myStaticVariable;
}