public interface TestInterfaceThree extends TestInterfaceOne, TestInterfaceTwo{
    public void PrintTestInterfaceThree();

    @Override
    default void PrintTestInterfaceOne() {

    }
}
