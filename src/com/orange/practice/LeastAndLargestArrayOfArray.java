package com.orange.practice;

public class LeastAndLargestArrayOfArray {
	static int[][] S = {{10,2}, {2,4,8}, {4,-1,6,7,8,9}};
	static int max;
	static int min = S[0][0];
	public static void main(String[] args) {
		for (int i = 0; i < S.length; i++) {
			for (int j = 0; j < S[i].length; j++) {
				//System.out.println(S[i][j]);
				if (S[i][j] > max) {
					max = S[i][j];
				}
				if (S[i][j] < min) {
					min = S[i][j];
				}
			}
		}
		System.out.println("The Maximum Value in the Array is "+ max);
		System.out.println("The Minimum Value in the Array is "+ min);

	}

}
