package com.orange.staticpackage;

public class StaticVariableMethodCall {
	
	// Static static variables from static methods
	 
	static int addNum = 5;
	
	public static void main(String[] args) {
		int resultAdd = sum(5);
		System.out.println(resultAdd);
	}
	
	public static int sum(int num) {
		return num + addNum;
	} 
	

}
