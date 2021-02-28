public class VariablesPlayGround {
    public static void main(String[] args){
        VariablesPlayGround obj1 = new VariablesPlayGround();
        obj1.InstanceVariable(); // Instance variable getting called through method call
        StaticNonStatic obj2 = new StaticNonStatic();
        obj2.myName = "Durai"; //Non Static variable getting value though object1
        StaticNonStatic obj3 = new StaticNonStatic();
        obj3.myName = "Murugan"; //Non Static variable getting value though object2
        System.out.println("Instance Variable  ==> " +obj2.myName.toUpperCase() + " "+ obj3.myName.toUpperCase());
        StaticNonStatic.myFloat = (float) 23.3;
        System.out.println("Static Variable ==> " +StaticNonStatic.myFloat);
    }
    public void InstanceVariable(){
        //Local Variable only accessed inside the function or method or constructor
        int age = 0;
        age = age + 5;
        System.out.println("Local Variable ==> "+ age);
    }
}
class StaticNonStatic{
    //Instance variable called through the class object
    String myName;
    //Static Variable called through class identifier not required to create a object
    static float myFloat;
}
