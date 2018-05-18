package com.orange.practice;
//import java.util.Scanner;
import java.util.*;
/*
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.
 */
public class WarmupB {
	static Scanner scan = new Scanner(System.in);
	static int inputNumber;
	public static void main(String[] args) {
		System.out.println("Please enter the inputNumber");
		inputNumber = scan.nextInt();
		System.out.println(inputNumber = diff(inputNumber));
	}
	public static int diff(int inputNumber) {
		if (inputNumber >= 21) {
			inputNumber = inputNumber - 21;
			return inputNumber * 2;
		}else {
			return inputNumber = 21 - inputNumber;
		}
	}

}
