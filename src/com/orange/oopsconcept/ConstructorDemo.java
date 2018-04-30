package com.orange.oopsconcept;

public class ConstructorDemo {

	public static void main(String[] args) {
		String device;
		ConstructorClass myObject = new ConstructorClass();
		myObject.setMyDevice("Macbook Pro Retina  Display");
		device = myObject.getMyDevice();
		System.out.println("My Device is  : " + device);
		/*reverse the string */
		for (int i = device.length()-1; i>=0; i--) {
			System.out.print(device.charAt(i));
		}

	}

}
