public class DataTypeRevise {
    public static void main(String[] args) {
        DeclaremyVariables D1 = new DeclaremyVariables();
        DeclaremyVariables.setMyStaticInt(2021);
        D1.setMyInt(2020);
        D1.setMyBoolean(true);
        D1.setMyByte((byte) 'c');
        D1.setMyLong(345678);
        D1.setMyShort((short) 222);
        System.out.println("Int Class Variables "+ D1.getMyInt());
        System.out.println("Bool Class Variables "+D1.isMyBoolean() );
        System.out.println("Byte Class Variables "+ D1.getMyByte());
        System.out.println("Long Class Variables "+D1.getMyLong() );
        System.out.println("Short Class Variables "+D1.getMyShort());
        System.out.println("Int Instance Variables "+DeclaremyVariables.getMyStaticInt());
        myFunc();
    }
    public static void myFunc(){
        int myLocalInt=0;
        System.out.println("Int Local Variables "+ myLocalInt);
    }
}
