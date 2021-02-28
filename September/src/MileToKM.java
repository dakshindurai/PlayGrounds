public class MileToKM{
    public static void main(String args[]){
        System.out.println("Creating an Object M1");
        MileToKMCalculation M1 = new MileToKMCalculation();
        System.out.println("Object called the defualt Constructor");
        M1.mile= 52.0564;
        M1.kM=100;
        System.out.println(M1.mile);
        System.out.println(M1.convertMiletoKM());
    }
}

class MileToKMCalculation{
    double mile, kM;
    public MileToKMCalculation(){
        System.out.println("Constructor getting called");
        mile=100;
        System.out.println(mile);
    }
        public void setMile(double mile) {
        mile = mile;
    }
    public double convertMiletoKM(){
        kM = mile*1.624;
        return kM;
    }
}