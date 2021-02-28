public  class Area {
    public static void main(String[] args){
        TriangleArea T1 = new TriangleArea();
        T1.Lenght=10;
        T1.Width=30;
        T1.area();
        RectangleArea R1 = new RectangleArea();
        R1.width=100;
        R1.length=1;
        R1.area();
    }
}

class TriangleArea {
    int Lenght;
    int Width;
     void area(){
         System.out.println("Area of Triangle "+ (Lenght*Width)/2);
    }
}

class RectangleArea{
    int length;
    int width;
    void area(){
        System.out.println("Area of Rectangle "+ length*width);
    }
}

