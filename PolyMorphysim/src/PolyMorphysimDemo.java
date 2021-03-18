public class PolyMorphysimDemo {

    public static void main(String[] args){
         A  Aobject = new A();
         B  Bobject = new B();
         C  Cobject = new C();

         A ref;   // reference should be created for Super Class not the child class
         ref = Aobject;
         ref.m1();

         ref=Aobject;
         ref.m1();

         ref = Bobject;
         ref.m1();

         ref = Cobject;
         ref.m1();



    }
}
