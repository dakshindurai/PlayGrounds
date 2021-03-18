public class CircleClass extends AbstractShapeClass{
    double radius;
    public CircleClass(String shapeName, double radius){
        super(shapeName);
        this.radius= radius;
        System.out.println("Constructor of Circle Class");
    }

    @Override
    double area() {
        return (22.7*radius*radius);
    }

    @Override
    public String toString() {
        return ("The Shape is  "+ shapeName + " and the Area is " + area());
    }
}

