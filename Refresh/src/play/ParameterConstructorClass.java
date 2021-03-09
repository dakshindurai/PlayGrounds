package play;

public class ParameterConstructorClass {
    static String myStringName;
    int myIntRollNo;

    public ParameterConstructorClass(String myStringName, int myIntRollNo){
        this.myStringName= myStringName;
        this.myIntRollNo=myIntRollNo;
    }
    public String getMyStringName() {
        return myStringName;
    }

    public void setMyStringName(String myStringName) {
        this.myStringName = myStringName;
    }

    public int getMyIntRollNo() {
        return myIntRollNo;
    }

    public void setMyIntRollNo(int myIntRollNo) {
        this.myIntRollNo = myIntRollNo;
    }
}
