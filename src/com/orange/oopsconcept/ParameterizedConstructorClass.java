package com.orange.oopsconcept;

public class ParameterizedConstructorClass {
	// Parameterized Constructor Class to set the values of class variable 
	private String myCar;
	private String myCarModel;
	private int myCarYear;
	
	public ParameterizedConstructorClass(String myCar, String myCarModel, int myCarYear) {
		System.out.println("Set the Values of the class variables");
		this.myCar = myCar;
		this.myCarModel = myCarModel;
		this.myCarYear = myCarYear;
		System.out.println();
 	}
	
	public String getMyCar() {
		return myCar;
	}
	public String getMyCarModel() {
		return myCarModel;
	}
	public int getMyCarYear() {
		return myCarYear;
	}
}
