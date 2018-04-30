package com.orange.practice;
import java.util.Scanner;

public class ReverseStringOrderUserInput {

	public static void main(String[] args) {
		String inputString ="";
		String reversedString;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter String to Reverse : ");
		inputString = scan.nextLine();
		
		while (inputString.isEmpty() || inputString == "") {
			System.out.println("Plese enter a valid input string");
			inputString = scan.nextLine();
		}
		scan.close();
		reversedString = reverseMethod(inputString);
		System.out.println(reversedString);
		
	}
	public static String reverseMethod(String inputString) {
		String outputString = "";
		String[] stringArray = inputString.split("\\s+");
		for (int i = stringArray.length-1; i>=0; i--) { // ex : this, is, a, string
			outputString = outputString  + stringArray[i] + " "; // "" + string,  string + a, string + a + is, string + a + is,
																// string + a + is + this
		}
//		for (String item:stringArray) { // ex : this, is, a, string
//			outputString = item + " " + outputString; // this + "", is + this, a + is + this , string + a + is + this
//		}
		return outputString;
	}

}
