package com.orange.practice;

public class SecondLargestInArray {
	static int[] intArray1 = {5,3,7,2,0,-1,2,20, 1,21};
	static int firstLargest;
	static int secondLargest;
	public static void main(String[] args) {
		// to find the second largest number in an array
		for (int i = 0; i <= intArray1.length-1; i++) {
			if (intArray1[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = intArray1[i];
			}else if (intArray1[i] > secondLargest){
				secondLargest = intArray1[i];
			}
		}
		System.out.println("The First Largest Number : " + firstLargest);
		System.out.println("The Second largest Number : " + secondLargest);
	}
}
