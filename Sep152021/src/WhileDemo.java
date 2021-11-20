public class WhileDemo {
    private int whileTrueValue;
    WhileDemo(int passValue){
        whileTrueValue = passValue;
        return;
    }
    public static void main(String[] args){
        WhileDemo whileObj = new WhileDemo(15);
        while (whileObj.whileTrueValue < 4){
            System.out.println("Condition of While is true "+ whileObj.whileTrueValue);
            whileObj.whileTrueValue ++;
        }
    }
}
