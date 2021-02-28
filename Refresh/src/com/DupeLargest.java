package com;

public class DupeLargest {
	static int n1[] = {23, 6,-1,0,22,4,9,-1,24};
	static int largest = n1[0];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Largest "+ n1[0]);
		long startTime = System.nanoTime();
		largest = findLargest(n1);
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println(elapsedTime);
		System.out.println("Actual Largest " + largest);
	}
	public static int findLargest (int[] n1) {
		int arrayLen = n1.length;
		for (int i = 0; i < arrayLen; i++) {
			for (int j = 0; j < arrayLen; j++) {
				if ((n1[i] > n1[j]) && (n1[i] > largest)) {
					largest = n1[i];
				}
			}
		}
		return largest;
	}
	
}
