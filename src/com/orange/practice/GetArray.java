package com.orange.practice;
import java.util.Scanner;

public class GetArray {
	static Scanner scan = new Scanner(System.in);
	static int arrayLength;
	public static void main(String[] args) {
		getDisplayArray();
	}
	public static void getDisplayArray() {
		System.out.println("Please Enter the Array length : ");
		arrayLength = scan.nextInt();
		int[] myArray = new int[arrayLength];
		System.out.println("Input the Array elements : ");
		for (int i = 0; i < arrayLength; i++) {
			myArray[i]= scan.nextInt();
		}
		for (int i = 0; i < arrayLength; i++) {
			if (i == arrayLength-1) {
				System.out.print(myArray[i]);
			} else 
			{
				System.out.print(myArray[i] + ",");
			}
		}
	}
}
