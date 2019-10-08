package com.orange.practice;
import java.util.Scanner;

public class PrimeNumbersUpToN {
	static Scanner scan = new Scanner(System.in);
	static long uptoNumber;
	static boolean foundPrime = true;
	public static void main(String[] args) {
		System.out.println("Please enter the upto number to find Prime : ");
//		System.out.println(isPrime (Long.parseLong(scan.next())));
		
		validateNull(uptoNumber = scan.nextLong());
		getPrimeNumbers(uptoNumber);
	}
	public static void validateNull(long uptoNumber) {
		while(uptoNumber <= 0 ) {
			System.out.println("Please Enter a Valid number to check prime : ");
			validateNull(uptoNumber= scan.nextLong());
		}
	}
	
	public static boolean isPrime (long number) {
		for (int i = 2; i < number; i ++) {
			if (number % i== 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumbers(long uptoNumber) {
		for (int i = 2 ; i < uptoNumber; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					foundPrime = false;
					break;
				}
			}
			if (foundPrime) {
				System.out.print (i +" ");
			}
			if (i >= 3) {
				foundPrime = !foundPrime;
			}

	    }
	}

}
