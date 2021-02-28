import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
//        int[] myInt = {2,3,1,2,3};
        int multiple =0;
        int firstFive =5;
//        System.out.println(Arrays.toString(myInt));
//        for (int i=0; i< myInt.length; i++){
//            System.out.println(myInt[i]);
//        }
        for (int i =1; i<=firstFive; i++){
            multiple = multiple + 12*i;
        }
        System.out.println(multiple/firstFive);

    }
}
