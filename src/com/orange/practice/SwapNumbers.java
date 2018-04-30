package com.orange.practice;
import java.util.Scanner;

public class SwapNumbers {
	static int num1;
	static int num2; 
	static int input;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		num1 = getNumbers();
		num2 = getNumbers();
		scan.close();
		swap(num1, num2);

	}
	public static int getNumbers() {
		System.out.println("Please Enter the number : ");
		input = scan.nextInt();
		return input;
		
	}
	public static void swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Num1 is : " + num1 );
		System.out.println("Num2 is : " + num2 );
	}

}
