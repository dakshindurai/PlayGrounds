package com.orange.practice;

public class CommonCharacters {
	static String S1 = "string";
	static String S2 = "strong";
	static String S3 = "";
	public static void main(String[] args) {
		S3 = compareCharacters(S1, S2);
		System.out.println(S3);
	}
	private static String compareCharacters (String S1, String S2) {
		char [] s1 = S1.toCharArray();
		char [] s2 = S2.toCharArray();
		int l1 = s1.length;
		int l2 = s2.length;
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j< l2; j++ ) {
				if (s1[i] == s2[j]) {
					S3 = S3 + s1[i];
				}
			}
		}return S3;
	}
}
