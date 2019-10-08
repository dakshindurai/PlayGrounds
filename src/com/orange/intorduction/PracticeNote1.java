package com.orange.intorduction;

public class PracticeNote1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] myArray1 = myString.toCharArray();
		
		for (int i = 0; i < myArray1.length; i++) {
			System.out.println(myArray1[i]);
			System.out.println();
		}
		
		for (int i = myArray1.length; i>0; i--) {
			System.out.print(myArray1[i-1]);
		}
		for (int i = myString.length(); i>0; i--) {
			System.out.print(myString.charAt(i-1));
		}
	}
}
