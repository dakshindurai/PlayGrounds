package com.orange.intorduction;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is the test String";
		String str1 = str.concat(" This is the appended String"); //appends the string and stores in another object reference
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "World";
		String str5 = "";
		String str6 = " Spaces all around          ";
		String str7 = "SIT";
		String str8 = "String used to convert to character array";
		String str9 = "Reverse Me";		
		char[] charArray = str8.toCharArray();
	
		System.out.println(str.length()); // returns the length of the string
		System.out.println(str.charAt(0)); // returns the char value at the specified index
		System.out.println(str.concat(" This is the appended String")); // appends the string at the end 
		System.out.println(str.contains("This")); // returns true/false if the specified character is found in the string
		System.out.println(str.contains("appended"));		
		System.out.println(str1.contains("appended"));
		System.out.println(str.startsWith("This")); // returns true or false based on string starts with 
		System.out.println(str.endsWith("String")); // returns true or false based on string ends with 
		System.out.println(str.startsWith("is")); 
		System.out.println(str.endsWith("This"));
		System.out.println(str2.equals(str3));  // Compares string objects
		System.out.println(str2.equals(str4));  // Compares string objects
		System.out.println(str4.indexOf('X'));
		System.out.println(str4.isEmpty());
		System.out.println(str5.isEmpty());
		System.out.println(str6.trim());  // trim the leading spaces on both side
		System.out.println(str1.toLowerCase()); // converts the string to lower case
		System.out.println(str1.toUpperCase()); // converts the string to upper case
		System.out.println(str7.replace('I', 'A')); // replace the character in the string
		
		// print each character of string using string methods
		
		for (int i = 0; i<str8.length(); i++) {
			System.out.println("The Index of " + i + " is : " + str8.charAt(i));
		}
			
		// print each character of string by converting it to character array
		
		for (int i = 0; i<charArray.length; i++){
			System.out.println("The Index of " + i + " is : " + charArray[i]);
		}
		
		//reverse a string using string methods
		
		for (int i = str9.length(); i>0; i--) {
			System.out.print(str9.charAt(i-1));
		}
		
		System.out.println();
		
		for (int i = str9.length()-1; i>=0; i--) {
			System.out.print(str9.charAt(i));
		}
		
		System.out.println();
		
		char[] charArray1 = str9.toCharArray();
		for (int i = charArray1.length-1; i>=0; i--) {
			System.out.print(charArray1[i]);
		}
	}
	
}


