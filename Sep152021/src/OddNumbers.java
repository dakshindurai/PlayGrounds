public class OddNumbers {
    public static void main(String[] args){
        int i;
        for(i=0; i< 20; i++ ){
            if (i%2==0 & i!=0){
                continue;
            }
            System.out.println("Value if i "+ i);
        }
    }
}
