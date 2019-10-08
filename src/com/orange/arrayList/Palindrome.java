package com.orange.arrayList;


public class Palindrome {
	static String s2 = "";
	public static void main(String[] args) {
		String s1 = "ABCDCBA";
		//String s4 = s1;	
		//checkPalindrome(s1);
		int s1StringLen = s1.length();
//		System.out.println(s2);
		for (int i = 0; i < s1StringLen; i++ ) {			
			if (!(i==0)){
				s1 = getforwardString(s1);
			}
			
			checkPalindrome(s1);
		}
					

	}
	
	public static void checkPalindrome(String palindromeString) {
		s2 = "";
		char[] pChar = palindromeString.toCharArray();
		int stringLength = pChar.length;
		for (int j = stringLength; j > 0; j--) {
			s2 = s2 + pChar[j-1];
		}
			if (palindromeString.contentEquals(s2)) {
				System.out.println("String  "+ palindromeString + " Is Palindrome String");
			}
	}
	
	public static String getforwardString(String s1) {	
		char [] s1Temp = s1.toCharArray();
		int s1TempLen = s1Temp.length;
		s1= "";
		for ( int j = 0; j < s1TempLen-1; j++) {
			s1 = s1 + s1Temp[j];
		}
		System.out.println("String >>" + s1);
		return s1;
	}
	
	public static String getreverseString(String s4, String s2) {
		s2 = "";
		char [] s1Temp = s4.toCharArray();
		int s1TempLen = s1Temp.length;
		s4 = "";
		for ( int j = 1; j < s1TempLen; j++) {
			s4 = s4 + s1Temp[j];
		}
		System.out.println("String <<" + s4);
		return s4;
	}
		
		
	

}
