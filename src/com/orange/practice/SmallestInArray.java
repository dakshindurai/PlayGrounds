package com.orange.practice;
import java.util.Scanner;

public class SmallestInArray {
	static int[] myArray = {-1, 0, 100, 32,201, -202, 43,12,90,94, -1001};
	static int smallest = myArray[0];
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		displaySmallest(smallest = checkSmallest());
	}
	public static int checkSmallest() {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < smallest) {
				smallest = myArray[i];
			}			
		}
		return smallest;
	}
	public static void displaySmallest(int smallest) {
		System.out.println("Smallest number in the array is :  " + smallest);
	}
}
