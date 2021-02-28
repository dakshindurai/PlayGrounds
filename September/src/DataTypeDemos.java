public class DataTypeDemos{
    public static void main(String[] args){
        System.out.println("Primitive DataTypes");
        DeclaredVariables myVar = new DeclaredVariables();
        myVar.setMyBoolean(true);
        System.out.println("Boolean ==========> "+myVar.isMyBoolean());
        myVar.setMyChar('a');
        System.out.println("Char ==========> "+myVar.getMyChar());
        myVar.setMyByte((byte)2);
        System.out.println("Byte ==========> "+myVar.getMyByte());
        myVar.setMyShort((short)10);
        System.out.println("Short ==========> "+myVar.getMyShort());
        myVar.setMyInt(2147483647);
        System.out.println("Int ==========> "+ myVar.getMyInt());
        myVar.setMyLong(40);
        System.out.println("Long ==========> "+myVar.getMyLong());
        myVar.setMyFloat(3.4555f);
        System.out.println("Float ==========> "+ myVar.getMyFloat());
        myVar.setMyDouble(34.56);
        System.out.println("Double ==========> " + myVar.getMyDouble());
        myVar.setMyDouble(56.34);
        System.out.println("Double ==========> " + myVar.getMyDouble());
    }
}
