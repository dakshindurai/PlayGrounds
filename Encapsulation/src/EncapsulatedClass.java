public class EncapsulatedClass {
    private int encapsulatedInteger;
    private String encapsulatedString;
    private byte encapsulatedByte;

    public int getEncapsulatedInteger() {
        return encapsulatedInteger;
    }

    public void setEncapsulatedInteger(int encapsulatedInteger) {
        this.encapsulatedInteger = encapsulatedInteger;
    }

    public String getEncapsulatedString() {
        return encapsulatedString;
    }

    public void setEncapsulatedString(String encapsulatedString) {
        this.encapsulatedString = encapsulatedString;
    }

    public byte getEncapsulatedByte() {
        return encapsulatedByte;
    }

    public void setEncapsulatedByte(byte encapsulatedByte) {
        this.encapsulatedByte = encapsulatedByte;
    }
    public String toString(){
        return ("My Encapsulated Integer " + this.encapsulatedInteger + "\n" + "My Encapsulated String " + this.encapsulatedString
         + "\n" + " My Encapsulated Byte " + this.encapsulatedByte);
    }
}
