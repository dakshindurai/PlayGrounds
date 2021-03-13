public class FirstChild extends ParentMultiChild{
    public void FirstChildPrint(){
        System.out.println("From Child One");
    }
    public static void main(String[] args){
        ParentMultiChild p1 = new ParentMultiChild();
        p1.ParentPrint();
    }
}
