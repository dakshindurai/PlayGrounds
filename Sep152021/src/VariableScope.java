public class VariableScope {
    private int instanceVariable ;
    int subClassVariable;
    static int staticVariable;
    public static void main(String [] args){

        VariableScope v1 = new VariableScope();
        v1.instanceVariable = 100;
        VariableScope v2 = new VariableScope();
        InstantStatic c11 = new InstantStatic();
        System.out.println(c11.instanceVariables);
        System.out.println(InstantStatic.staticVariables);

        int NewLocalVariable = scopeDied();
        System.out.println("New LocationVariable Value : "+ NewLocalVariable);
        System.out.println("Instance Variable "+ v1.instanceVariable);
        System.out.println("Instance Variable "+ v2.instanceVariable);
        VariableScope.staticVariable = 300;
        System.out.println("Static Variable " + VariableScope.staticVariable);
        {
            {
                int x = 5;
                {
                    int x1 = 10;
                    System.out.println(x1);
                }
                System.out.println(x);
            }
        }
    }
    static int scopeDied(){
        //Local Variable scope died when this method is called and exited
        int localVariable = 10;
        System.out.println("LocalVariable " + localVariable);
        return (localVariable);
    }
}
class testClass {

    public void method1(){
        {
            {
                int x = 5;
                {
                    int x1 = 10;
                    System.out.println(x);
                }
            }
        }

    }
}
