import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class StringDemo1{
    public static void main(String[] args){
        //Define and Declare a string
        String sb = "Geeks";
        System.out.println(sb);
        //Define and Declare a string using new keyword
        String sb1 = new String("Geeks");
        System.out.println(sb1);
        byte[] stringByte = {71, 101, 101, 107, 115};
        Charset ch = Charset.defaultCharset();
        String decodeByteString = new String(stringByte);
        System.out.println(decodeByteString);
        String decodeByteStringCh = new String(stringByte,ch);
        System.out.println(decodeByteStringCh);
        String decodeByteStringCh1 = new String(stringByte, 1, 3);
        System.out.println(decodeByteStringCh1);

    }
}
