package com.orange.practice;
import java.util.Scanner;
public class AddingNumbers {
	static int input1, input2, resultAdd;
	static String inputString;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		input1 = Integer.parseInt(getInput());
		input2 = Integer.parseInt(getInput());
		System.out.println("The addition of two numbers is :  "
				+ (resultAdd = addNumbers(input1, input2)));
	}
	public static String getInput() {
		System.out.println("Please Enter the Number : ");
		inputString = checkNull(scan.nextLine());
		return inputString;
	}
	public static String checkNull(String inputString) {
		while (inputString.isEmpty()) {
			System.out.println("Please Enter Valid input : ");
			inputString = scan.nextLine();
		}
		return inputString;
	}
	public static int addNumbers(int input1, int input2) {
		resultAdd = input1 + input2;
		return resultAdd;
	}

}
