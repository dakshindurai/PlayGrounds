package com.orange.intorduction;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal  stored in String Constant Pool
		String str1 = "Hello";
	
		//String Object stored in Heap Storage
		String str2 = new String("Welcome");
		
		//Strings are immutable
		String str3 = "I am String";  // (reference for this will be removed and mapped to below content, and this will be garbage collected)
		str3 = "I am a new String";
		
		//creating a new object by concatenating other strings
		String str4 = str1 + " " + str2 + " " + str3;
		
		System.out.println("String str1 value is : " + str1);
		System.out.println("String str2 value is : " + str2);
		System.out.println("String str3 value is : " + str3);
		System.out.println("String str4 value is : " + str4); 
	}

}
