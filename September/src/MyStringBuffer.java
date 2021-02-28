public class MyStringBuffer {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("GeeksOfGeeks");
        StringBuffer str1 = new StringBuffer("GeeksOfGeeks");
        if (str==str1){
            System.out.println("Both the String are equal "+str);
        }else{
            System.out.println("Both are not equal "+str1 );
        }
    }
}
