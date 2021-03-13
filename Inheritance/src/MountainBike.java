public class MountainBike extends Bicycle{
    String cycleType;

    public MountainBike(String cycleColor, String cycleBrand, String cycleType){
        super(cycleColor,cycleBrand);
        this.cycleType=cycleType;

    }

    public String getCycleType() {
        System.out.println(""+ cycleBrand);
        return cycleType;

    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }



    public String toString(){
        return ("  Bike Color is "  +cycleColor +"\n" + "  Bike Brand is "+ cycleBrand +"\n" + "  Bike Type is "+ cycleType);
    }
}
