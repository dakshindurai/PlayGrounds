public class VariableScope {
    static int x; // Class / Static  Variables, accessed through class name
    int y; // Instance Variables
    public static void main(String args[]){
        VariableScope.x=10;
        System.out.println(VariableScope.x);
        VariableScope.x =20;
        System.out.println(VariableScope.x);
        VariableScope obj1 = new VariableScope();
        obj1.y=10;
        VariableScope obj2 = new VariableScope();
        System.out.println(obj1.y);
        System.out.println(obj2.y);

    }


}
