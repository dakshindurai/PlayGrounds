package com.orange.oopsconcept;

public class CarDemo {

	public static void main(String[] args) {
		Car carObject = new Car();  // Create and Initialize Object 
		
		System.out.println();
		carObject.setCarColor("Blue");
		System.out.println("The Color of Car I have is  : GS " + carObject.getCarColor());
		carObject.setCarMake("Nissan");
		System.out.println("The Make of Car I have is  : GS "+ carObject.getCarMake());
		carObject.setCarModel("Altima");
		System.out.println("The Model of Car I have is  : GS " + carObject.getCarModel());
		carObject.setCarYear(2010);
		System.out.println("The Year of Car I have is  : GS " + carObject.getCarYear());
		carObject.getMiles();
	
		Car carObject1 = new Car ("Black", "Honda", "Civic", 2004);
		System.out.println(carObject1.getCarColor());
		System.out.println(carObject1.getCarMake());
		System.out.println(carObject1.getCarModel());
		System.out.println(carObject1.getCarYear());
	}

}
