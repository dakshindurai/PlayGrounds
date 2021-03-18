public class MultipleInheritance implements InterfaceThree{
    public static void main(String[] args){
        MultipleInheritance M1 = new MultipleInheritance();
        M1.print_geeksForGeeks();
        M1.print_for();
        M1.greeksZero();
    }

    @Override
    public void print_geeksForGeeks() {
        System.out.println("Geeks");
    }

    @Override
    public void print_for() {
        System.out.println("For");
    }

    @Override
    public void greeksZero() {
        System.out.println("Geeks");
    }

    @Override
    public void print_geeks() {

    }


}
