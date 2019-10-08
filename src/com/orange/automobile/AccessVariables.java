package com.orange.automobile;

public class AccessVariables {
	//no access modifiers, visible and accessible in the same package(variables, methods, constructors);
	int dollarValue;
	// private access modifiers visible and accessible in the another class if the package and class is imported
	// through getter and setter(Encapsulation)
	private int privateDollarValue;
	// public access modifiers can be visible and accessible anywhere in same class and other class 
	// if the package and class is imported
	public int publicDollarValue;
	//protected access modifiers can be accessed in same package and in other package if the class is sub class
	static protected int protectedDollarValue;
	
	public static void main(String[] args) {
		System.out.println();
	}
	
	public int getPrivateDollarValue() {
		return privateDollarValue;
	}
	
	public void setPrivateDollarValue(int privateDollarValue) {
		this.privateDollarValue = privateDollarValue;
	}	
}
