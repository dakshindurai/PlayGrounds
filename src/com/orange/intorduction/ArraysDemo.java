package com.orange.intorduction;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		//declaring the array length and assigning values
		int[] intArray1 = new int[10];
		intArray1[0] = 100;
		intArray1[1] = 20;
		intArray1[2] = 30;
		
	
		//defining the array and assigning values
		int[] intArray2 = {18,27,3};
		
		String[] stringArray1 = {"Hello", "World", "Welcome","Arraylist"};
		
		for (int i = 0; i<intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}
		
		Arrays.sort(intArray1); //sorting integer array

		System.out.println(intArray2.toString());
		
		
		for (int j = 0; j<intArray1.length; j++) {
			System.out.println(intArray1[j]);
		}
		
		for (int i = 0; i<stringArray1.length; i++) {
			System.out.println(stringArray1[i]);
		}
		Arrays.sort(stringArray1); //sorting character array
		
		for (int i = 0; i<stringArray1.length; i++) {
			System.out.println(stringArray1[i]);
		}
	}

}
