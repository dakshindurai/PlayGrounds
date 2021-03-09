package play;

import java.sql.SQLOutput;

public class CalledClass {
    public int myInteger;    // Instance Variable
    public String myString;  // Instance Variable

    public CalledClass(){
        System.out.println("Default Constructor getting called ...");
    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
