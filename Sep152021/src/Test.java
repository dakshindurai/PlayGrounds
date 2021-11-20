
public class Test
{
    static int x = 11;
    private int y;  // Instance created for the object t
    public void method1(int x)
    {
        Test t = new Test();
        this.x = 22;
        y = 44;

       System.out.println("Test.x: " + Test.x); // 22
//        System.out.println("t.x: " + t.x); // 22
//        System.out.println("t.y: " + t.y); // 22
        System.out.println("y: " + y);  //44
    }

    public static void main(String args[])
    {
        Test t = new Test();
        System.out.println("Instance Value :"  + t.y);
        int y = 20;
        System.out.println("Local Variable :"  + y);
        Test t1 = new Test();
        System.out.println("Instance Value :"  + t1.y);
        System.out.println("Class Variable "+ x);
        t.method1(5);
    }
}