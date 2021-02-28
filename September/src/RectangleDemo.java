public class RectangleDemo {
    public static void main(String args[]) {
        System.out.print("Rectangle Perimeter for the coordinates ===>");
        Rectangle r1 = new Rectangle();
        r1.setRecLength(10);
        r1.setRecWidth(20);
        System.out.println(r1.getRecLength() + ", " + r1.getRecWidth());
        System.out.println("Perimeter of Rectangle " + r1.perimeter());
        System.out.println("Area of Rectangle " + r1.Area());
    }
}

class Rectangle {
    int recLength, recWidth;

    public int getRecLength() {

        return recLength;
    }

    public void setRecLength(int recLength) {

        this.recLength = recLength;
    }

    public int getRecWidth() {

        return recWidth;
    }

    public void setRecWidth(int recWidth) {

        this.recWidth = recWidth;
    }

    public int perimeter() {
        int perimeter = recLength + recLength + recWidth + recWidth;
        return perimeter;
    }

    public int Area() {
        int Area = recLength * recWidth;
        return Area;
    }
}