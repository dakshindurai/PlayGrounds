public class DataTypeConversion {
    public static void main(String[] args){
        byte myByte = 10;
        int myInt = myByte; // Automation Conversion or Widening Conversion
        short myShort = myByte; // Automation Conversion or Widening Conversion
        short myIntShort = (short) myInt; // Manual Conversion or Narrow Conversion
        System.out.println(myIntShort);
        System.out.println(myShort);
    }
}
