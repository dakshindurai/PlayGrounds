public class SquareDemo {
    public static void main(String args[]){
        int squareLength = 5;
        int squareWidth = 5;
        Square s1 = new Square();
        System.out.println(s1.calPerimeter(squareLength,squareWidth));
        System.out.println(s1.calArea(squareLength,squareWidth));
    }
}
class Square{
    public int calPerimeter(int squareLength, int squareWidth){
        int squarePerimeter = squareLength+squareLength+squareWidth+squareWidth;
        return squarePerimeter;
    }
    public int calArea(int squareLengh, int squareWidth){
        int squareArea = squareLengh*squareWidth;
        return squareArea;
    }
}
