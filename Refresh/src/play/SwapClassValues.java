package play;

public class SwapClassValues {
    int no;
    public static void main(String[] args){
        SwapClassValues c1 = new SwapClassValues();
        SwapClassValues c2 = new SwapClassValues();
        c1.no=10;
        c2.no=20;
        System.out.println("c1.no "+ c1.no);
        System.out.println("c2.no "+ c2.no);
        swap(c1, c2);
    }
    public static void swap(SwapClassValues c1, SwapClassValues c2){
        int temp;
        temp = c1.no;
        c1.no = c2.no;
        c2.no = temp;
        System.out.println("Swapped c1.no "+ c1.no);
        System.out.println("Swapped c2.no "+ c2.no);
    }
}
