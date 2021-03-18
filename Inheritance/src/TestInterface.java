public class TestInterface implements TestInterfaceThree{
    public static void main(String[] args){
        TestInterface testObject = new TestInterface();
        testObject.PrintTestInterfaceOne();
        testObject.PrintTestInterfaceTwo();
        testObject.PrintTestInterfaceThree();

    }

    @Override
    public void PrintTestInterfaceThree() {
        System.out.println("PrintTestInterfaceThree");

    }

    @Override
    public void PrintTestInterfaceOne() {
        System.out.println("PrintTestInterfaceOne");

    }

    @Override
    public void PrintTestInterfaceTwo() {
        System.out.println("PrintTestInterfaceTwo");

    }
}
