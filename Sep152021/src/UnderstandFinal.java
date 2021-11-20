import javax.lang.model.element.NestingKind;

public class UnderstandFinal {
    final int instanceVariable;
    static String myName = "HeMan";
    UnderstandFinal(int j){
        instanceVariable = j;
    }
    UnderstandFinal() {
        instanceVariable = 100;
    }
    public static void main(String[] args) {
        final int localVariable;
        localVariable = 10;
        System.out.println("Value of Local Variable " + localVariable);
        UnderstandFinal uf1 = new UnderstandFinal();
        System.out.println("Final Instance Variable Through Default No Value Constructor  " + uf1.instanceVariable);
        UnderstandFinal uf2 = new UnderstandFinal(200);
        System.out.println("Final Instance Variable Through Value Constructor  " + uf2.instanceVariable);
        UnderstandFinal uf3 = new UnderstandFinal(300);
        System.out.println("Another Value Final Instance Variable Through Value Constructor  " + uf3.instanceVariable);
        System.out.println("Value from class variable " + UnderstandFinal.myName);
    }
}