package package1;

public class NonSubClass1 {
    public static void main(String[] args){
        Class1 classObject = new Class1();

        classObject.myPublicString = "public string accessed";

        classObject.myProtectedString = "protected string accessed";

        classObject.myDefaultString = "default string accessed";

        System.out.println(classObject.toString());
    }
}
