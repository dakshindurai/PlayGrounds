/*
 * Adding N numbers based on the input
 */
package com.orange.practice;
import java.util.Scanner;

public class AddingNumbersUptoN {
	static Scanner Scan = new Scanner(System.in);
	static int inputNumber;
	static int[] inputArray;
	static int addResult;
	public static void main(String[] args) {
		System.out.println("Enter a positive number to be added : ");
		 inputArray = new int[inputNumber = Scan.nextInt() + 1];
		 inputArray = getInput(inputNumber);
		 System.out.println("Addition of all numbers : "+(addResult = addingElements(inputArray)));
	}
	
	public static int[] getInput(int inputNumber) {
		 for (int i = 0; i < inputNumber; i++) {
			 inputArray[i] = i;
		 }
		 return inputArray;
	}
	public static int addingElements(int[] inputArray) {
		 for (int i = 0; i < inputArray.length; i++) {
			 addResult = inputArray[i] + addResult;
		 }
		 return addResult;
	}

}
