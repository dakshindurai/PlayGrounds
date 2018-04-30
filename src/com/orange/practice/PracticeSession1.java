package com.orange.practice;
import java.util.Scanner;

public class PracticeSession1 {	
	static String inputString;
	static String[] inputArray;
	static String outputString = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		inputString = scan.nextLine();
		while (inputString.isEmpty()) {
			System.out.println("Please enter a valid String");
			inputString = scan.nextLine();
			
		}
		scan.close();
		outputString = reverseMethod(inputString);
		System.out.println(outputString);
		
	}
	
	public static String reverseMethod (String inputString) {
		
		inputArray = inputString.split("\\s+");
		for (int i = inputArray.length-1; i >= 0; i--) {
			outputString = outputString  + inputArray[i] + " ";
		}
		return outputString;
	}

}
