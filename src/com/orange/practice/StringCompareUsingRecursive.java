package com.orange.practice;
import java.util.Scanner;

public class StringCompareUsingRecursive {
	static String firstInput;
	static String secondInput;
	static Scanner S1 = new Scanner(System.in);
	static String resultComparasion;
	
	public static void main(String[] args) {
		//firstInput = validateNull(S1.nextLine());
		validateNull(firstInput = S1.nextLine());
		secondInput = validateNull(S1.nextLine());
		System.out.println(resultComparasion = compareInputs(firstInput, secondInput));
		S1.close();
	}
	/*
	 * Validate if the input is null
	 */
	public static String validateNull(String stringInput) {
		while (stringInput.isEmpty()) {
			System.out.println("Please Enter the a valid Input");
			stringInput = validateNull(S1.nextLine());  
		}		
		return stringInput;
	}
	/*
	 * Compare both the inputs
	 */
	public static String compareInputs(String firstInput, String secondInput) {
		resultComparasion = "Both the inputs items are NOT equal";
		if (firstInput.equals(secondInput)) {
			resultComparasion = "Both the inputs items are equal";
		}
		 return resultComparasion;
	}

}
