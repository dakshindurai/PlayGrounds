package com.orange.practice;

public class RemoveDuplicateElement {
	static int[] inputArray = {1,3,5,6,9,4,5,1,4,6,3,2,-2,1};
	//output = {1,3,5,6,9,4,2, -2}
	public static void main(String[] args) {
		removeDuplicate(inputArray);
	}
	private static void removeDuplicate(int[] inputArray) {
		int arrayLength = inputArray.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j< arrayLength; j++) {
				if ((inputArray[i] == inputArray[j])) { 
					if (i <= j) {  
						//System.out.println("The Value of i : " + i + " " + inputArray[i]);
						System.out.print(inputArray[i] + " ");
						break;
					}
					//System.out.println("The Value of j : " + j + " " + inputArray[j]);
					//System.out.print(inputArray[i] +  " ");
					break;
				}
			}
		}
	}
}
