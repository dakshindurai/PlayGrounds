public class EncapsulationDemo {
    public static void main(String[] args){
        EncapsulatedClass EncapsulatedObject = new EncapsulatedClass();
        EncapsulatedObject.setEncapsulatedInteger(100);
        EncapsulatedObject.setEncapsulatedString("Hello");
        EncapsulatedObject.setEncapsulatedByte((byte) 10);
        System.out.println(EncapsulatedObject.getEncapsulatedInteger());
        System.out.println(EncapsulatedObject.getEncapsulatedString());
        System.out.println(EncapsulatedObject.getEncapsulatedByte());
    }
}
