public class TestInterfaceT1 implements TestInterfaceOne {
    public static void main(String[] args){
        TestInterfaceT1 obj = new TestInterfaceT1();
        obj.PrintTestInterfaceOne();
    }
    @Override
    public void PrintTestInterfaceOne(){
        System.out.println("test");
    }
}

