package play;

public class SwapClassMultipleValues {
    int carNo;
    String carName;
    public static void main (String[] args){
        SwapClassMultipleValues carObject1 = new SwapClassMultipleValues();
        SwapClassMultipleValues carObject2 = new SwapClassMultipleValues();
        carObject1.carNo = 987;
        carObject1.carName = "Tesla";
        carObject2.carNo = 123;
        carObject2.carName = "Nissan";
        System.out.println("Car Object 1 carName : " + carObject1.carName);
        System.out.println("Car Object 1 carNo : " + carObject1.carNo);
        System.out.println("Car Object 2 carName : " + carObject2.carName);
        System.out.println("Car Object 2 carNo : " + carObject2.carNo);
        swap (carObject1, carObject2);
    }
    public static void swap(SwapClassMultipleValues carObject1, SwapClassMultipleValues carObject2){
        SwapClassMultipleValues temp = carObject1;
        carObject1 = carObject2;
        carObject2 = temp;
        System.out.println("Car Object 1 carName : " + carObject1.carName);
        System.out.println("Car Object 1 carNo : " + carObject1.carNo);
        System.out.println("Car Object 2 carName : " + carObject2.carName);
        System.out.println("Car Object 2 carNo : " + carObject2.carNo);
    }
}
