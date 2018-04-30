package com.orange.oopsconcept;

public class Car {
	// color
	private String carColor;  //STATE - member variable or class variables
	// model
	private String carModel;
	// make
	private String carMake;
	// year
	private int  carYear;
	
	public Car() {
		
		this("Silver","Oddesy","Hondo", 2018);
		System.out.println();
		System.out.println("First Execute the default constructor with default arguments");
		System.out.println();
		System.out.println("The Color of Car I have is  Default : " + carColor);
		System.out.println("The Make of Car I have is  Default : "+ carModel);
		System.out.println("The Model of Car I have is  Default : " + carMake);
		System.out.println("The Year of Car I have is  Default : " + carYear);
	}
	
	public Car(String carColor, String carMake, String carModel, int carYear) {
		System.out.println();
		System.out.println("Execute the user defined constructor with user defined values");
		this.carColor = carColor;
		this.carModel = carModel;
		this.carMake = carMake;
		this.carYear = carYear;
		System.out.println();
		System.out.println("The Color of Car I have is UD : " + carColor);
		System.out.println("The Make of Car I have is UD : "+ carModel);
		System.out.println("The Model of Car I have is UD : " + carMake);
		System.out.println("The Year of Car I have is UD : " + carYear);
		
		//System.out.println("carColor :" + carColor + " carModel "+ carModel + " carMake :"+ carMake + " carYear :"+carYear);
	}
	//BEHAVIOR - of class is a method
	public void getMiles() {   
		System.out.println("Mileage of Car is 300 miles per gallons");
	}
	
	//this refers to the instance of a class (object)
	public String getCarColor() {
		return this.carColor;
	}
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;		
	}
	
	public String getCarModel() {
		return this.carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		if (carYear > 2008) {
			this.carYear = carYear;
		}else {
			this.carYear = 1000;
		}
		
	}
	
}

