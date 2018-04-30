package com.orange.practice;
import java.util.Scanner;

public class StringCompare {
	
	static String string1;
	static String string2;
	static String status;
	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		string1 = S1.nextLine();
		while (string1.isEmpty()) {
			System.out.println("Please enter the first string : ");
			string1 = S1.nextLine();
		}
		string2 = S1.nextLine();
		while (string2.isEmpty()) {
			System.out.println("Please enter the second string : ");
			string1 = S1.nextLine();
		}
		S1.close();
		status = stringCompare (string1, string2);
		System.out.println(status);
	}
	public static String stringCompare(String string1, String string2) {
		status = "Both the input strings are not equal";
		if (string1.equals(string2)) {
			status = "Both the input strings are equal";
		}
		return status;
	}
	

}
