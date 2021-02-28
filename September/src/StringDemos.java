import java.util.Arrays;

public class StringDemos {
    public  static String reversedString = "";
    public  static boolean yesPalindrome;
    public static void main(String[] args){
        String myString = "Hello";
        String palString = "MalayalaM";
        //Convert to Character Array and Reverse a String
        reversedString = CharToReverseString(myString);
        System.out.println("Reversing the String "+ myString+ " to "+ reversedString);
        //Check a String is Palindrome
        yesPalindrome  = IsPalindrome(palString);
        if (yesPalindrome){
            System.out.println("The String "+ palString +" is Palindrome");
        }else {
            System.out.println("The String "+ palString + " is not Palindrome");
        }
        StringtoCharConversion();
    }
    public static String CharToReverseString(String myString){
        char[] myChar = myString.toCharArray();
        for(int i = myChar.length-1; i >=0; i--){
            reversedString = reversedString + myChar[i];
        }
        return reversedString;
    }
    public static boolean IsPalindrome(String palString){
        char palChar[] = palString.toCharArray();
        String newPalString="";
        for (int i = palChar.length-1; i >=0; i--){
            newPalString=newPalString+palChar[i];
        }
        return (palString.matches(newPalString));
    }
    public static void StringtoCharConversion(){
        String str = new String("journelDev");
        //Convert String to Char Array
        char[] char1 = str.toCharArray();
        System.out.println(char1[0]);
        //Convert String using charAtIndex
        char ch1 = str.charAt(0);
        System.out.println(ch1);
        //Convert using string function
        char[] charArry1 = new char[7];
        str.getChars(0,7,charArry1,0);
        System.out.println(charArry1);
    }
}