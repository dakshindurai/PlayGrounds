import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args){
        String stringToSplit = "Hi I am a Java Learner";
        String[] splitString = stringToSplit.split(" ");
        System.out.println(Arrays.toString(splitString));
        String stringSplit = "Hello|I am|learning|Java";
        String[] splitDelimit = stringSplit.split("\\|");
        System.out.println(Arrays.toString(splitDelimit));
        for (int i=0; i<splitString.length; i++){
            System.out.println(splitString[i]);
        }
        String splitcharacter = "abaacea";
        String[] letsSplit = splitcharacter.split("a");
        System.out.println(Arrays.toString(letsSplit));
        System.out.println(letsSplit[0]);
        String s1 = new String("durai");
        String s2 = new String("DuraiMurugan");
        System.out.println(s1);
        System.out.println(s1= s2);
        RemoveACharacter(s1,'u');
    }
   public static void RemoveACharacter(String s1,char ch1){
        char[] mycharArray = s1.toCharArray();
        String newString="";
        for (int i=0; i<mycharArray.length;i++){
            if(mycharArray[i]!=ch1){
                newString = newString + mycharArray[i];
            }
        }
       System.out.println(newString);

   }
}
