public class ConditionFlows {
    public static void main(String[] args){
        int a=100;
        if(a<1000){
            System.out.println("Inside if Block");
        }else{
            System.out.println("Inside Else Block");
        }
        String myString = (a <1000)?"Inside If" : "Inside else";
        System.out.println(myString);


        if(a>1000)
            System.out.println("Inside if Block");
            System.out.println("Else");
    }

}
