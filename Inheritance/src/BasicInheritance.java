public class BasicInheritance {
    public static void main(String[] args){
        Bicycle byCycleObject = new Bicycle("Blue","RoadMaster");
        byCycleObject.getCycleBrand();
        Bicycle byCycleObjectTwo = new Bicycle("", "");
        byCycleObjectTwo.getCycleBrand();
        byCycleObjectTwo.setCycleBrand("Tuffs");
        byCycleObjectTwo.getCycleBrand();
        MountainBike mountainBikeObject = new MountainBike("Red","Shwin","MountainBike");
        System.out.println(mountainBikeObject.toString());
        mountainBikeObject.setCycleBrand("Hyper");
        mountainBikeObject.setCycleColor("Black");
        mountainBikeObject.setCycleType("Gear Bike");
        System.out.println(mountainBikeObject.toString());
    }

}
