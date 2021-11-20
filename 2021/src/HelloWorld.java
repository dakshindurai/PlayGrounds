import java.util.logging.Logger;

public class HelloWorld {
    public static void main(String[] args){
        Logger Log = Logger.getLogger(HelloWorld.class.getName());
        Log.info("Hello World");
    }
}
