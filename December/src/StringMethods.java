public class StringMethods {
    public static void main(String[] args){
        String myString = "Geeks for Geeks";
        new StringMethods().testData(myString);
    }
    private void testRun(String myString){
        System.out.println("My String : " + myString);
        System.out.println("Length " + myString.length());
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.charAt(6));
        System.out.println(myString.contains("eek"));
        System.out.println(myString.charAt(1));
        System.out.println(myString.getBytes());
    }
    private void testData(String myString){
        new StringMethods().testRun(myString);
    }
}
