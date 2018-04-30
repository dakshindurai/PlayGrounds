package com.orange.practice;
import java.util.Scanner;
import java.util.logging.Logger;

public class StringOrderReverse {
	
	static String inputString;
	static String outputString = "";
	static String tempString;
	static String[] inputArray;
	
	static Logger myLogger = Logger.getLogger("/");
	
	public static void main(String[] args) {
	
		System.out.println("Please Enter your String : ");
		Scanner scan = new Scanner(System.in);
		
		inputString = scan.nextLine();
		while (inputString.isEmpty()) {
			System.out.println("Please enter a valid input String");
			inputString = scan.nextLine();
		}
		scan.close();
		if (inputString.length() == 1) {
			outputString = inputString;
		}else {
			inputArray = inputString.split("\\s+");
			outputString = reverseMethod(inputArray);
		}
		System.out.println(outputString);
	}
	public static String reverseMethod(String[] inputArray) {
		for (String tempString: inputArray) {
			outputString = tempString + " " + outputString;			
		}
		return outputString;
	}
}
