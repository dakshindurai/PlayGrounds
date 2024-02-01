public class SwitchCase {
    static SwitchCase sc = new SwitchCase();
    public static void main(String[] args){
        System.out.println("Check Switch Case ");
        sc.testCase();
    }
    public void testExecution(int i){
        switch (i) {
            case 1:
                System.out.println("Case 1 called");
                System.out.println(i);
                break;
            case 2:
                System.out.println("Case 2 called");
                System.out.println(i);
                break;
        }
    }
    public void testCase(){
        sc.testExecution(1);
        sc.testExecution(11);
    }
}
