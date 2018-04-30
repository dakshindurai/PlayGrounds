package com.orange.practice;


public class LargestNumerInArray {
	static int[] integerArray = {10,30,31,12,-1,15,40};
	static int firstLargest;
	public static void main(String[] args) {
		// find the largest number in an array
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] > firstLargest) {
				firstLargest = integerArray[i];
		}
	}System.out.println("The First Largest Number in Array : "+ firstLargest);

	}
}
	

