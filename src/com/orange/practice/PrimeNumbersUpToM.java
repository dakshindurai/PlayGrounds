package com.orange.practice;
import java.util.Scanner;

public class PrimeNumbersUpToM {
	static Scanner scan = new Scanner(System.in);
	static String inputString;
	static int inputNumber;
	static boolean foundPrime = true;
	public static void main(String[] args) {
		System.out.println("Prime Numbers up to ? : ");
		inputString = checkNull(scan.nextLine());
		inputNumber = Integer.parseInt(inputString);
		getPrime(inputNumber);
	}
	public static String checkNull(String inputString) {
		while (inputString.isEmpty()) {
			System.out.println("Enter a valid input number : ");
			inputString = checkNull(scan.nextLine());
		}
		return inputString;
	}
	public static void getPrime(int inputNumber) {
		for (int i = 2; i <= inputNumber; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					foundPrime = false;
					break;		
				}
			}
			if (foundPrime) {
				System.out.print (i +" ");

			}
			// reset the value;
			if (i >= 3) {     
				foundPrime = ! foundPrime;
			}
			
		}
		
	}

}
