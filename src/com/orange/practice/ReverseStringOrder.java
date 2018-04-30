package com.orange.practice;

public class ReverseStringOrder {

	public static void main(String[] args) {
		String myString = "This is a test String bla bla bla bla";
		String[] myStringArray = myString.split("\\s+");
		String reversedString = "";
		
		
		for (int i = myStringArray.length-1; i >=0; i--) {
			 reversedString = reversedString + " " + myStringArray[i];
		}
		System.out.println(reversedString);
	}
	
}
