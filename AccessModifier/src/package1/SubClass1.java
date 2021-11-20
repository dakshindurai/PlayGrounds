package package1;

public class SubClass1 extends Class1 {
    public static void main(String[] args){
        Class1 classoneObject = new Class1();

        classoneObject.myPublicString="String one";

        classoneObject.myProtectedString="String two";

        classoneObject.myDefaultString = "String three";

        System.out.println(classoneObject.toString());
    }
}
