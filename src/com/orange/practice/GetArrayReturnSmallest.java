package com.orange.practice;
import java.util.Scanner;

public class GetArrayReturnSmallest {
	static Scanner scan = new Scanner(System.in);
	static int length;
	static int smallest;
	static int[] myArray;
	static int firstsmallest, secondsmallest;
	public static void main(String[] args) {
		System.out.println("Please Enter the Array Length :");
		int[] myArray = getArray(length = scan.nextInt());
		System.out.println("The Smallest Element in Array is :  " + (smallest = smallest(myArray)));
		System.out.println("The Second Smallest Element in Array is : " + (secondsmallest = secondSmallest(myArray)));
	}
	/*
	 * Get the elements of Array
	 * return Array
	 */
	public static int[] getArray(int length) {
		if (length == 0) {
			System.out.println("Enter the valid array length greater than 0");
			getArray(length = scan.nextInt());
		} else {
			System.out.println("Enter the array Elements :  ");
			myArray = new int[length];
			for (int i = 0; i < length; i++) {
				myArray[i]= scan.nextInt();
			}	
			
		}
		return myArray;
	}
	/*
	 * Calculate Smallest
	 * return Smallest
	 */
	public static int smallest(int[] myArray) {
		smallest = myArray[0];
		if (myArray.length == 1) {
			return smallest;
		} else {
			for(int i = 0; i < myArray.length; i++) {
				if (myArray[i] < smallest) {
					smallest = myArray[i];
				}
			}
			return smallest;	
		}
	}
	public static int secondSmallest(int[] myArray) {
		firstsmallest  = myArray[0];
		secondsmallest = myArray[1];
		if (secondsmallest < firstsmallest) {
			firstsmallest = myArray[1];
			secondsmallest = myArray[0];
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < firstsmallest) {
				secondsmallest = firstsmallest;
				firstsmallest = myArray[i];
			}
				
		}
		return secondsmallest;
	}

}
