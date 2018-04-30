package com.orange.practice;
import java.util.Scanner;

public class StringReverseUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String to reverse : ");
		String inputString = scan.nextLine();
		// Validate if the user enters the non empty string 
		while (inputString.isEmpty()) {
			System.out.println("Please enter a valid String : ");
			inputString = scan.nextLine();
		}
		scan.close();
		StringReverseUserInput s1 = new StringReverseUserInput();
		String outputString = s1.reverseMethod(inputString);
		System.out.println("The Reversed String : "+ outputString);
		
	}
	public String reverseMethod(String inputString) {
		String reversedString ="";
		for (int i = inputString.length()-1; i >= 0; i--) {
			reversedString = reversedString + inputString.charAt(i);
		}
		return reversedString;
	}
}
