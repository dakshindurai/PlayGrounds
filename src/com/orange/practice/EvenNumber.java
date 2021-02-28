package com.orange.practice;
import java.util.Scanner;

public class EvenNumber {

	static Scanner scan = new Scanner(System.in);
	static int inputNumber; 
	static String result;

	public static void main(String[] args) {
		System.out.println("PLease Enter the Number to validate even : ");
		displayResult(result = validateEven(inputNumber= scan.nextInt()));
	}
	public static String validateEven(int inputNumber) {
		result = "ODD";
		if (inputNumber % 2 == 0) {
			result = "EVEN";
		}
		return result;			
		}
	public static void displayResult(String result) {
		System.out.println("The Give Number is : "+ result + " number");
	}
}


