package com.orange.practice;

public class SecondSmallestLargestinAA {
	static int[][] myInt = {{1,200,-5,3},{2,3,4},{23,0,-3,-1,56,24},{0,-2,57,-4,20,12, -6}} ;
	static int firstSmallest = myInt[0][0];
	static int secondSmallest;
	static int firstLargest, secondLargest;
	static String inputString;
	public static void main(String[] args) {
		System.out.println("The Second Largest in a 2 Dimensional Array is :  " + (secondLargest = secondGreatest(myInt)));
		System.out.println("The First Largets in a 2 Dimensional Array is : " + (secondSmallest = secondSmallest(myInt)));
	}
	public static int secondGreatest(int[][] myInt) {
		for (int i = 0; i < myInt.length; i++) {
			for (int j = 0; j < myInt[i].length; j++) {
				if (myInt[i][j] > firstLargest) { 
					secondLargest = firstLargest;
					firstLargest = myInt[i][j];
				}
				else if (myInt[i][j] > secondLargest) {
					secondLargest = myInt[i][j];
				}
			}
		}
		return secondLargest;
	}
	public static int secondSmallest(int[][] myInt) {
		for (int i = 0; i < myInt.length; i++) {
			for (int j = 0; j < myInt[i].length; j++) {
				if (myInt[i][j] < firstSmallest) {
					secondSmallest = firstSmallest;
					firstSmallest = myInt[i][j];
				}else if (myInt[i][j] < secondSmallest) {
					secondSmallest = myInt[i][j];
					
				}
			}
		}
		
		return secondSmallest;
	}

}
