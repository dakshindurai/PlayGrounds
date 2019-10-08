package com.orange.practice;

public class NumberOfOccuranceInCharArray {
	static char [] c1 = {'a','e','a','f','g','g','g','k'};
	static int count;
	static String outputSting = "";
	public static void main(String[] args) {
		outputSting = Occurance(c1);
		System.out.println(outputSting);
		
	}
	private static String Occurance(char[] c1) {
		int c1Length = c1.length;
		int occuranceCount;
		for (int i = 0; i < c1Length; i++) {
			int count = 0;
			for ( int j = 0; j < c1Length; j++) {
				if (c1[i] == c1[j] ) {
					count = count + 1;
				}
			}
			occuranceCount = count;
			String S3 = "(" + c1[i] + ","+ occuranceCount + ")";
			if(! outputSting.contains(S3))
				outputSting =  outputSting + S3 ;
		}return outputSting;
	}
}
