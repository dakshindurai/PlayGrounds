public class ForwardDeclaration {
    int test(){
        int i = j;
        return i;
    }
    int j = 10;
    public static void main(String[] args){
        ForwardDeclaration f1 = new ForwardDeclaration();
        System.out.println(f1.test());
    }
}
