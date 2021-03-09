package play;

public class CallingClass {
    public static void main(String[] args){
        CalledClass object = new CalledClass();
        System.out.println(object.myString);
        System.out.println(object.getMyInteger());
    }
}
