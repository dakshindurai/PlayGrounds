public class DerivedClassTest extends BaseClassTest{
    //Derived Class or Child Class or Extended Class
    int time;
    //Parameterized Constructor forDerived Class
    public DerivedClassTest(int speed, int distance, int time){
        super(speed, distance);
        this.time= time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String toString(){
        return ("The Speed is  "+ speed + "\n" + "The Distance is  "+ distance + "\n" + "The Time is "+ time);
    }
}
