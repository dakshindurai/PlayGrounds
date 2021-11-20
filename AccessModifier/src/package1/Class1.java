package package1;

public class Class1 {
    public String myPublicString;
    protected String myProtectedString;
    private String myPrivateString;
    String myDefaultString;


    public String getMyStringVariableClass1() {
        return myPublicString;
    }

    protected void setMyStringVariableClass1(String myStringVariableClass1) {
        this.myPublicString = myStringVariableClass1;
    }
    public String toString(){
        return ( "myPublicString is " + myPublicString + "\n" +
                "myProtectedString is " + myProtectedString + "\n" +
                "myPrivateString " + myPrivateString + "\n" +
                "myDefaultString " + myDefaultString);
    }
}
