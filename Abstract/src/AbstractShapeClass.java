abstract class AbstractShapeClass {
    String shapeName;

    //Parameterized Constructor of Abstract class
    public AbstractShapeClass(String shapeName){
        this.shapeName=shapeName;
        System.out.println("Constructor of Abstract Class ...");
    }
    //Concrete Methods of Abstract Class
    public String getShapeName() {
        return shapeName;
    }
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    //abstract methods
    abstract double area();
    public abstract String toString();
}
