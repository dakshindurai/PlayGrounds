public class StringBtoString {
    public static void main(String[] args){
        new StringBtoString().testData();
    }
    private void testRun(StringBuffer sbf){
        String str = new String(sbf);
        System.out.println(str);

    }
    private void testRun1(StringBuilder sbd){
        String str1 = new String(sbd);
        System.out.println(str1);
    }
    private void testData(){
        //Data set1 for String Buffer
        StringBuffer sbf = new StringBuffer("Hello");
        new StringBtoString().testRun(sbf);
        //Data set2 for String Builder
        StringBuilder sbd = new StringBuilder("Jurasic");
        new StringBtoString().testRun1(sbd);
    }
}
