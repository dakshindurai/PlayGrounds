public class TestingAbstract{
    public static void main(String[] args){
        AbstractShapeClass s1 = new CircleClass("Circle", 2.3);
        AbstractShapeClass s2 = new TriangleClasss("Triangle ", 10,10);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s2.getShapeName());
    }
}
