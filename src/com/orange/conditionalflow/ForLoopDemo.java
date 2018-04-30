package com.orange.conditionalflow;

import java.util.Arrays;

public class ForLoopDemo {

	public static void main(String[] args) {
		byte[] byteArray1 = {10, 20, 15, 27};
		int[] intArray1 = {2300,43000,50003,10003,50001};
		char[] charArray1 = {'a', 'b','c','d'};
		String[] stringArray1 = {"bmw","benz","audi","honda","toyota"};
		//for loop to increment the value during execution
		for (int i = 1; i < 11; i++) {
			System.out.println("The Value of i Gets INCREMENTED is : "+i);
		}
		System.out.println();
		//for loop to decrement the value during execution
		for (int i = 10; i > 0; i--) {
			System.out.println("The Value of i gets DECREMENTED is : "+i);
		}
		System.out.println();
		//for loop to iterate byte Array
		for (int i = 0; i < byteArray1.length; i++) {
			System.out.println("The value of index "+ i + " is "+ byteArray1[i] );
		}
		System.out.println();
		//for loop to iterate integer array, without using array index 
		for (byte byteArrayVar: byteArray1) {
			System.out.println("The value of int Array "+ byteArrayVar);
		}
		System.out.println();
		//for loop to iterate integer Array
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println("The value of index "+i+ " is "+ intArray1[i] );
		}
		System.out.println();
		//for loop to iterate integer array, without using array index 
		for (int intArrayVar: intArray1) {
			System.out.println("The value of int Array "+ intArrayVar);
		}
		System.out.println();
		//for loop to iterate character Array
		for (int i = 0; i < charArray1.length; i++) {
			System.out.println("The character at index "+ i + " is "+ charArray1[i]);
		}
		System.out.println();
		//for loop to reverse the character array
		System.out.print("The reserved String is : ");
		for (int i = charArray1.length-1; i >= 0; i--) {
			System.out.print(charArray1[i]);
		}
		System.out.println();
		//for loop to iterate char array, without using array index
		System.out.println();
		for (char charVariable:charArray1) {
			System.out.println("The character array is "+ charVariable);
		}
		System.out.println();
		//for loop to iterate String Array
		for (int i = 0; i < stringArray1.length; i++) {
			System.out.println("The Index of " +i + " is "+ stringArray1[i]);
		}
		System.out.println();
		Arrays.sort(stringArray1); //sorting the array
		//for loop to iterate String Array, without using array index
		for (String arrayVariable1: stringArray1) {
			System.out.println("The string Array is " + arrayVariable1);
		}
	}

}
