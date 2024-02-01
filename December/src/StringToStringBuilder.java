public class StringToStringBuilder {
    static StringToStringBuilder sbd1 = new StringToStringBuilder();
    public static void main(String[] args){
        sbd1.testData();
    }
    private void testRun(String str){
        System.out.println("Test Run Results");
        StringBuilder sbuild = new StringBuilder(str);
        System.out.println("String Builder Conversion "+ sbuild.append("World"));
    }
    private void testData(){
        //Data set1
        String str1 = "Hello";
        sbd1.testRun(str1);
        String str2 = "Jurasic";
        sbd1.testRun(str2);
    }
}
