public class Primary {
    public static void main(String[] args){
        DerivedClassTest derivedClassTestObject = new DerivedClassTest(20,200, 2000);
        derivedClassTestObject.setDistance(10);
        derivedClassTestObject.setSpeed(100);
        derivedClassTestObject.setTime(10);
        System.out.println(derivedClassTestObject.toString());
    }
}
