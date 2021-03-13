public class SingleInheritanceClassOne {
    String classOne;
    int classNumber;

    public String getClassOne() {
        return classOne;
    }

    public void setClassOne(String classOne) {
        this.classOne = classOne;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    public void print_one(){
        System.out.println("Method of First Class ....");
    }
    public String toString(){
        return ("Class One Name is : " + this.classOne +"\n" + "Class one Number is : " + this.classNumber);
    }
}
