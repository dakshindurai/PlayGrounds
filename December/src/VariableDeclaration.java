public class VariableDeclaration {
    int instanceInt =10;
    static int staticInt = 20;
    public static void main(String[] args){
        //Variable is a name given for memory location
        //Every Variable should have a data type and data value to it
        //Local Variable Declared inside a method and has scope inside the method
        int count=10;
        System.out.println("Local Variable "+ count);
        VariableDeclaration v1 = new VariableDeclaration();
        System.out.println("Instance Variable " + v1.instanceInt);
        System.out.println("Static Variable "+ VariableDeclaration.staticInt);
        v1.testMethod();
    }
    public void testMethod(){
        System.out.println("Static Accessed in any method "+ VariableDeclaration.staticInt);
        VariableDeclaration v2 = new VariableDeclaration();
        System.out.println("Instance Accessed in any method "+ v2.instanceInt);
    }
}
