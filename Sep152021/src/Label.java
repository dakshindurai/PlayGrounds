public class Label {
    public static void main(String[] args){
        outer:
            for (int i=0; i<10; i++){
                for (int j=0; i<10; j++){
                    if (j==1){
                        continue outer;
                    }
                    System.out.println("The Value of i , j "+ i + " "+ j);
                }
        }
    }
}
