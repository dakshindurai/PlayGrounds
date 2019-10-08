package com.orange.practice;

public class ReverseUsingSwap {
	static String myString = "HELLO THERE";
	static String SwapedString = "";
	static String ReverserOrderedString = "";
	public static void main (String[] args) {
		SwapedString = reverseStringSwap (myString);
		System.out.println("Reversed Through Swapping " + SwapedString);
		SwapedString = "";
		SwapedString = reverseString (myString);
		System.out.println("Reversed Through reverseIteration " + SwapedString);
		ReverserOrderedString = reverseOrder (myString);
		System.out.println(ReverserOrderedString);
		
	}
	private static String reverseStringSwap(String myString) {
		char temp;
		char [] myStringCharArray = myString.toCharArray();
		int charArrayLength = (myStringCharArray.length - 1);
		for (int i = 0; i <= charArrayLength; i ++) {
			if (i < charArrayLength) {
				temp = myStringCharArray[i];
				myStringCharArray[i] = myStringCharArray[charArrayLength];
				myStringCharArray[charArrayLength] = temp;
				charArrayLength--;
			}
	}	
		String SwapedString = new String(myStringCharArray);
		return SwapedString;
	}
	private static String reverseString(String myString) {
		for (int myStringLength = myString.length() - 1; myStringLength >= 0; myStringLength--) {
			SwapedString = SwapedString + myString.charAt(myStringLength);
		}
		return SwapedString;
	}
	private static String reverseOrder(String myString) {
		String[] myNewString = myString.split("\\s");
		for (int splitLength = myNewString.length - 1; splitLength >= 0; splitLength--) {
			if (splitLength >0) {
				ReverserOrderedString = ReverserOrderedString + myNewString[splitLength] + " ";
			} else {
				ReverserOrderedString = ReverserOrderedString + myNewString[splitLength];
			}
			
		}
		return ReverserOrderedString;
	}
}


