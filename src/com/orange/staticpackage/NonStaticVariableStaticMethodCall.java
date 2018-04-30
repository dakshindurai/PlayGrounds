package com.orange.staticpackage;

public class NonStaticVariableStaticMethodCall {
	
	// Use Class Object to call non-static variable from static method 
	int addNum = 5;
	public static void main(String[] args) {
		int resultAdd = sum(5);
		System.out.println(resultAdd);
	}
	public static int sum(int num) {
		NonStaticVariableStaticMethodCall skd = new NonStaticVariableStaticMethodCall();
		return num + skd.addNum;
	}
	
}
