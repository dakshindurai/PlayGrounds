package com.orange.practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "ABCDEFGHIJK LMNOPQRST UVWXYZ";
		System.out.println("myString : "+myString);
		
		System.out.print("Reversed String Using char index from end : ");
		for (int i = myString.length()-1; i >= 0; i--) {
			System.out.print(myString.charAt(i));
		}
		System.out.println();
		System.out.print("Reversed String Using conver it to char Array : ");
		char[] myCharArray = myString.toCharArray();
		for (int i = myCharArray.length-1; i >= 0 ; i--) {
			System.out.print(myCharArray[i]);
		}
	}

}
