package package2;

import package1.Class1;

public class Package2Class1{
    public static void main(String[] args){
        Class1 classObjectOne = new Class1();
        classObjectOne.myPublicString="Test";
        System.out.println(classObjectOne.toString());
    }
}
