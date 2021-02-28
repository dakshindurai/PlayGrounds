import java.sql.SQLOutput;

public class MultiClassDemo{
    public static void main(String args[]){
        System.out.println("Calling Triangle Class");
        Triangles t = new Triangles();
        t.length=10;
        t.width=10;
        System.out.println("Area of Triangle :"+ t.Area());
        t.width=10;
        t.length=30;
        System.out.println("New Area of Triangle :"+ t.Area());

    }
}

class Triangles{
    int length, width;
    public int Area(){
        int Area = length*width;
        return Area;
    }

}