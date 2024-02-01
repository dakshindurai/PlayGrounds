public class StringToStringBuffer {
    public static void main(String[] args){
        new StringToStringBuffer().testData();
    }
    private void testRun(String str){
        StringBuffer stbr = new StringBuffer(str);
        System.out.println("String Buffer @ testRun " + stbr.append(" Class"));
    }
    private void testData(){
        //Data set1
        String str1 = "Demo";
        new StringToStringBuffer().testRun(str1);
        //Data set2
        String str2 = "1234";
        new StringToStringBuffer().testRun(str2);
    }
}
