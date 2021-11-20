class InstantStatic {
    protected int instanceVariables = 100;
    protected static int staticVariables = 1000;
}
public class VariableScopeAccess {
    public static void main(String[] args){
        InstantStatic c1 = new InstantStatic();
        System.out.println(c1.instanceVariables);
        }
    public void myMethod(){
        int localVariable = 100;
        System.out.println(localVariable);
    }
}
