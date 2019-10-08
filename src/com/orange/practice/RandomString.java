package com.orange.practice;

import java.util.Random;

public class RandomString {
	static String s1 = "StringHelloThere";
	static String s2 = "Hello";
	static String outputString = ""; // strng;
	static String numberOfOccurances2 = "";//(H,1)(e,1)(l,2)(o,1)
	private static final String ALPHA_NUMERIC_STRING  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz"; 
	public static void main(String[] args) {
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		outputString = commanChars(c1, c2);
		System.out.println(outputString);
		numberOfOccurances2 = occurances2(s1);
		System.out.println(numberOfOccurances2);
		//randomAlphaNumeric(5);
		System.out.println(RandomString 
                .randomAlphaNumeric(5));
		
	
	}
	//method to get number of occurances
	private static String occurances2(String s2) {
		char [] cS2 = s2.toCharArray();
		int cS2Len = cS2.length;
		int count = 0;
		for (int i = 0; i <cS2Len; i++) {
			count = 0;
			for ( int j = 0; j < cS2Len; j++) {
				if (cS2[i] == cS2[j]) {
					count = count + 1;
				}
			}
			if ( ! numberOfOccurances2.contains("(" + cS2[i] + "," + count + ")")) {
				numberOfOccurances2 = numberOfOccurances2 + "(" + cS2[i] + "," + count + ")";
			}
			
		}
		return numberOfOccurances2;
	}
	// Method to get the commanChars
	private static String commanChars(char[] c1, char [] c2) {
		int c1Length = c1.length;
		int c2Length = c2.length;
		for (int i = 0; i < c1Length; i++) {
			for (int j = 0; j < c2Length; j++) {
				if (c1[i] == c2[j]) {
					outputString = outputString + c1[i];
					break;
				}
			}
		}
		return outputString;
	}
	
	public static String randomAlphaNumeric(int count) {
		StringBuilder sb = new StringBuilder(count); 
		for (int i = 0; i < count; i++) { 
			int index 
            = (int)(ALPHA_NUMERIC_STRING.length() 
                    * Math.random()); 
			sb.append(ALPHA_NUMERIC_STRING 
                    .charAt(index)); 
		}
		return sb.toString(); 
	}
}
