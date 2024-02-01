public class StringDemoClass {
 public static void main(String[] args){
     String myString = "Demo";
     StringBuffer sb1= new StringBuffer("SBDemo");
     new StringDemoClass().testData(myString, sb1);
     System.out.println("myString Value @ main is "+ myString);
     System.out.println("String Buffer Value @ main is "+ sb1);
 }
 private void testRun(String myString, StringBuffer sb1){
     myString = myString + " Class";
     System.out.println("myString value @ testRun is "+ myString);
     sb1 = sb1.append(" Class");
     System.out.println("StringBuffer value @ testRun is "+ sb1);

 }
 private void testData(String myString, StringBuffer sb1){
     new StringDemoClass().testRun(myString, sb1);

 }
}
