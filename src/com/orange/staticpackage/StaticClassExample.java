package com.orange.staticpackage;

public class StaticClassExample {
	private String make;
	private static int instanceNum = 0;  // Declare the variable to static to retain the previous value

	public StaticClassExample(String make) {
		System.out.println("parameterized constructor");
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	public static int getInstanceNum() {
		return instanceNum;
	}

}
