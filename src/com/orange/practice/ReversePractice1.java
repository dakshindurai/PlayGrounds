package com.orange.practice;
public class ReversePractice1 {

	public static void main(String[] args) {
		String outputString="";
		// reverse the characters in string
//		String stringA = "Hello this is the string to reverse";
//		for (int i = stringA.length()-1; i > 0; i--) {
//			char outputString = stringA.charAt(i);
//			System.out.print(outputString);
//		}
		// reverse the order of string
		String stringB = "Hello this is the string to reverse";
		String[] A1 = stringB.split("\\s+");
//		for (int i = A1.length-1; i >= 0; i--) {
//			outputString = outputString + A1[i] + " ";
//			
//		}
		
		for (String item: A1) {
			outputString = item + " " + outputString;
		}
		System.out.println(outputString);

	}

}
