public class TriangleClasss extends AbstractShapeClass{
    double length;
    double width;
    public TriangleClasss(String shapeName, double length, double width){
        super(shapeName);
        this.length=length;
        this.width=width;
        System.out.println("Constructor of Triangle Class");
    }

    @Override
    double area() {
        return (.5*length*width);
    }

    @Override
    public String toString() {
        return ("The Shape is "+ shapeName + " Area is " + area());
    }
}
