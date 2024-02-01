public class AutoBoxing {
    //Creating a wrapper class on top of Integer objects
    public static void main(String[] args){
        int a = 10; // Primitive data type
       // Integer intObj = new Integer(a);
        Integer intObj = a;
        System.out.println("AutoBoxing  "+ intObj.toString().length());
        int b=intObj;
        System.out.println("Integer Un-Boxing "+ b);

    }
}
