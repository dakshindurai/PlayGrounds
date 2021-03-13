public class ParentMultiChild {
    int parentInt;
    String parentString;

    public int getParentInt() {
        return parentInt;
    }

    public void setParentInt(int parentInt) {
        this.parentInt = parentInt;
    }

    public String getParentString() {
        return parentString;
    }

    public void setParentString(String parentString) {
        this.parentString = parentString;
    }
    public void ParentPrint(){
        System.out.println("One Parent Multiple Child");
    }
    public String toString(){
        return ("Parent Integer  "+ parentInt + "\n" + "Parent String " + parentString);
    }
}
