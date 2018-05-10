package com.orange.practice;
import java.util.Scanner;

public class OddNumber {
	static Scanner scan = new Scanner(System.in);
	static int inputNumber;
	static String result = "EVEN";
	public static void main(String[] args) {
		System.out.println("Please Enter the number to check ODD : ");
		displayResult (result = validateOdd(inputNumber = scan.nextInt()));
	}
	public static String validateOdd(int inputNumber) {
		if (inputNumber % 2 !=0 ) {
			result = "ODD";
		}
		return result;
	}
	public static void displayResult(String result) {
		System.out.println("The input Number is : " + result + " number");
	}
}
