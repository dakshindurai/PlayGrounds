public class BreakFlow {
    public static void main(String[] args){
        boolean t=false;
        first:{
            System.out.println("This is first Block");
            second:{
                System.out.println("This is second Block");
                three:{
                    System.out.println("This is third Block");
                    if (t==false){
                        break second;
                    }
                }
                System.out.println("This is after Third");
            }
            System.out.println("This is after Second");
        }
        System.out.println("This is after First ");
    }
}
