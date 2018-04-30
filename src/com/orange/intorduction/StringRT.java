package com.orange.intorduction;

public class StringRT {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = str1;
		str1 = "Welcome";
		String concat = str2 + " " + str1;
		String concat1 = str2.concat(str1);
		String sub = str1.substring(0, str1.length());
		
		System.out.println("Newly Initialized String "+ str1);
		System.out.println("Reassgined String " + str2);
		System.out.println(concat);
		System.out.println(concat1);
		System.out.println(sub);
		
	}

}
