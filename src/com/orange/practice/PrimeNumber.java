package com.orange.practice;

public class PrimeNumber {
	static Boolean foundPrime = true;
	public static void main(String[] args) {
		long testNumber = 641813;
		for (int i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) {
				System.out.println(testNumber + " is not a Prime Number");
				foundPrime = false;
				break;
			}
		}
		if (foundPrime == true && testNumber > 1 ){
			System.out.println(testNumber + " is a Prime Number");
		}

	}

}
