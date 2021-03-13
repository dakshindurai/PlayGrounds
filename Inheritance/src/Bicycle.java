public class Bicycle {
    String cycleColor;
    String cycleBrand;

    //Constructor to get the values while creating object
    public Bicycle(String cycleColor, String cycleBrand){
        this.cycleColor = cycleColor;
        this.cycleBrand = cycleBrand;
    }

    //Getter method to get the value
    public String getCycleColor() {
        return cycleColor;
    }

    //Setter method to set the value
    public void setCycleColor(String cycleColor) {
        this.cycleColor = cycleColor;
    }

    public String getCycleBrand() {
        return cycleBrand;
    }

    public void setCycleBrand(String cycleBrand) {
        this.cycleBrand = cycleBrand;
    }
    public String toString(){
        return ("Bike Color is " + cycleColor +"\n" +  "Bike Brand is  "+ cycleBrand);
    }
}
