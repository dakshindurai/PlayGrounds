public class VariableType {
     int localVariable(){
         int i = 10; //local variable - declared inside a function
         i = 20;
        return i;
    }
    private int j=20; //instance variable - declared inside a class
    static int k; //static variable - declared same as instance variable but with the keyword static

    public static void main(String[] args){
        VariableType v1 = new VariableType();
        //local variable
        System.out.println(v1.localVariable()); // local variable can be created inside the function or block
        System.out.println(v1.j); // Instance variable can be called only after creating an object for the class
        System.out.println(v1.k);
        k = v1.j+v1.localVariable();
        System.out.println(k);  // static variable can be called without creating an object for class

    }
}
