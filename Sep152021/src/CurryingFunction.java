public class CurryingFunction {
    public void underScoreNum(int a){
        System.out.println("The Number "+ a);

    }
    public static void main(String[] args){
        CurryingFunction cf1= new CurryingFunction();
        cf1.underScoreNum(10_0_0);
    }
}
