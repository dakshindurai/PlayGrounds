public class SingleInheritanceClassTwo extends SingleInheritanceClassOne {
    String whichClass;
    public static void main(String[] args){
        SingleInheritanceClassTwo secondObject = new SingleInheritanceClassTwo();
        secondObject.print_one();
        secondObject.print_two();
        secondObject.setClassNumber(1);
        secondObject.setClassOne("First class string");
        secondObject.whichClass = "Second class string";
        System.out.println(secondObject.toString());

    }
    public void print_two(){
        System.out.println("Method from Class two ....");
    }
}
