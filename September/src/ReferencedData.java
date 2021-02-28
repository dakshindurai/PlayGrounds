public class ReferencedData {
    public static void main(String args[]) {
        System.out.println("Referenced or Non-Primitive Data Types");
        // String myString = "Greeks of Greeks";
        String myString = new String("Greeks of Greeks");
        System.out.println("String Data =========> " + myString);
        System.out.println(myString.charAt(7));
        if (myString.compareTo("Greeks of Greeks") == 0) {
            System.out.println("Both the String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        PrintObj p1 = new PrintObj();
        System.out.println(p1);
    }
}
class PrintObj {

}
