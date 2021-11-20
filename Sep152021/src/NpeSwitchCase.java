public class NpeSwitchCase {
    public void checkCase(String myString){
        switch (myString)
        {
            case "one":
                System.out.println("its One");
                break;
            case "two":
                System.out.println("its Two");
                break;
        }
    }
    public static void main(String[] args){
        NpeSwitchCase obj1 = new NpeSwitchCase();
        try{
            obj1.checkCase(null);
        }catch (NullPointerException nullPointerException)
        {
            System.out.println(nullPointerException.fillInStackTrace());
        }

    }
}
