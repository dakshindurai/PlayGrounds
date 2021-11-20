import java.util.Arrays;

public class AscIICharater {
    public static void main(String[] args){
        String constinousStringValidation = "ttxyz";
        char[] myCharArray = constinousStringValidation.toCharArray();
        AscIICharater asciiObject = new AscIICharater();
       // asciiObject.getHash(myCharArray);
        int x = 2;
        for (int y=0,z=0; x <10 || y < 10; x++, y++){
            System.out.println("y : "+ y );
            if (x==3){
            }
            // y :0,1,2,3,4,5,6,7, 8, 9
            // z :0
            // x :2,3,4,5,6,7,8,9, 10 11
        }
       // System.out.println("x : "+ x);  //12
        if (x <15){
            System.out.println( x + " is less than 15");
            if (x < 13) {
                System.out.println(x + " s less than 13 also ");
            }

       switch ('A'){
           case 'B':
               System.out.println("Matched B");
           case 'C':
               System.out.println("Matched C");
           case 'A':
               System.out.println("Matched D");
           default:
               System.out.println("No Matches");
               break;
           case 'E':
               System.out.println("Matched E");
           case 'F':
               System.out.println("Matched F");

       }
    }
//    public void getHash(char[] myCharArray){
//        for (int i=0; i < myCharArray.length; i++){
//            int asciiValue = myCharArray[i];
//            System.out.println(asciiValue);
//        }
//    }

}}



