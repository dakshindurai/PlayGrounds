public class BaseClassTest {
    int speed;
    int distance;
    //Constructor for BaseClassTest
    public BaseClassTest(int speed, int distance){
        System.out.println("Parameterized Constructor getting called during object creation ...");
        this.speed = speed;
        this.distance = distance;
    }
    //Getter and Setter Methods for getting input and display input
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public String toString(){
        final String s = "The Speed is " + speed + "\n" + "The Distance is " + this.distance;
        return s;
    }
}
