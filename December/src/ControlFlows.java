public class ControlFlows {
    public static void main(String[] args){
       new ControlFlows().testData();
    }
    private void testExecution(){
        for (int i=0; i<10; i++){
            if (i == 0){
                System.out.println("Continue Called");
                continue;
            }
            if (i == 7){
                System.out.println("Return Called");
                return;
            }
            if (i == 8){
                System.out.println("Break Called");
                break;
            }
            System.out.print(i +  "  ");
        }

    }
    private void testData(){
        new ControlFlows().testExecution();
    }
}
