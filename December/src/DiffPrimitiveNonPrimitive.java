import java.util.Arrays;

public class DiffPrimitiveNonPrimitive {
    public static void main(String[] args){
        int i =10;
        int j = i;
        System.out.println("Value of i " + i + "," + "Value of j "+ j);
        j = 20;
        System.out.println("After changing the valye of j ");
        System.out.println("Primitive Data Type ");
        System.out.println("Value of i "+ i + ","+ "Value of j "+ j);
        int[] intIArray = {10,20,30};
        int[] intJArray = intIArray;
        System.out.println("Array of i :"+ Arrays.toString(intIArray));
        System.out.println("Arra of j :"+ Arrays.toString(intJArray));
        intJArray[1]=21;
        System.out.println("After Changing the value");
        System.out.println("Array of i :"+ Arrays.toString(intIArray));
        System.out.println("Arra of j :"+ Arrays.toString(intJArray));
    }
}
