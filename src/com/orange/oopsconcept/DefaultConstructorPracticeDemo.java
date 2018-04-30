package com.orange.oopsconcept;

public class DefaultConstructorPracticeDemo {

	public static void main(String[] args) {
		// Default Constructor gets called when an object is initialized 
		DefaultConstructorPracticeClass D1 = new DefaultConstructorPracticeClass();
		D1.setMyDevice("Phone");
		D1.setMyDeviceModel("Apple");
		D1.setMyDeviceVersion("6s");
		
		System.out.println("my Device "+ D1.getMyDevice());
		System.out.println("my Device  Model "+ D1.getMyDeviceModel());
		System.out.println("my Device  Version "+ D1.getMyDeviceVersion());
		
		DefaultConstructorPracticeClass D2 = new DefaultConstructorPracticeClass();
		D2.setMyDevice("Phone");
		D2.setMyDeviceModel("SamSung");
		D2.setMyDeviceVersion("SamSung Galaxy");
		
		System.out.println("my Device "+ D2.getMyDevice());
		System.out.println("my Device  Model "+ D2.getMyDeviceModel());
		System.out.println("my Device  Version "+ D2.getMyDeviceVersion());
	}

}
