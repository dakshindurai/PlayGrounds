import java.util.StringTokenizer;

public class StringTokenDemo {
    public static void main(String[] args){
        String str = "Hello This is Demo";
        StringTokenizer st1 = new StringTokenizer(str);
        while (st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
