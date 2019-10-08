package com.orange.practice;

public class NumberOfOccuranceInString {
	static String inputString = "Hello";
	static String outputString = ""; //(h,3)(e,4)(l,2)(o,3)(t,1)(r,2)(w,1)(a,1)(y,1)(u,1)
	static char[] charArray = inputString.toCharArray();
	public static void main(String[] args) {
		outputString = occurance(charArray);
		System.out.println(outputString);
	}
	private static String occurance(char[] charArray) {
		int charLength = charArray.length;
		for (int i = 0; i < charLength; i++) {
			int count = 0;
			for (int j = 0; j < charLength; j++) {
				if (charArray[i] == charArray[j]) {
					count = count + 1;
				}
			}
			if (! outputString.contains("(" + charArray[i] + "," + count + ")") && (charArray[i] != ' ')) {
				outputString = outputString + "(" + charArray[i] + "," + count + ")" ;
			}
			
		}
		return outputString;
	}
}
