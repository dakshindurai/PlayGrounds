package com;
import play.CalledClass;
public class CallingClassFromCom {
    public static void main(String[] args){
        CalledClass object = new CalledClass();
        System.out.println(object.myString);
        object.setMyInteger(10);
    }
}
