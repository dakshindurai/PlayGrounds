package com.orange.practice;

public class ReverseString {
	static String reverseString="";
	static String myString = "Hello World";
	public static void main(String[] args) {
		reverseString = reverseString(myString);
		System.out.println(reverseString);
	}
	private static String reverseString(String myString) {
		String reverseString = "";
		for (int i = myString.length()-1; i >= 0; i--) {
			reverseString = reverseString + myString.charAt(i);
		}
		return reverseString;
	}
}
