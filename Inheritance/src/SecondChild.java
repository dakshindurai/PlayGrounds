public class SecondChild extends ParentMultiChild{
    public void SecondChildPrint(){
        System.out.println(" Second Child Print");
    }
    public static void main(String[] args){
        SecondChild SC = new SecondChild();
        SC.ParentPrint();
    }
}
