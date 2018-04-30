package com.orange.conditionalflow;

public class SwitchDemo {
	public static int numDays;
	public static void main(String[] args) {

		numDays = numofDays(2000,2);
		System.out.println(numDays);
	}
	
	//methods for calculating the number of Days
	public static int numofDays(int year, int month) {
		numDays = 0;
		switch (month) {
		case 1:
			numDays = 31;
			break;
		case 2:
			if (year % 400 == 0) {
				numDays = 29;
			}else {
				numDays = 28;
			}break;
		case 3:
			numDays = 30;
			break;
		case 4:
			numDays = 31;
			break;
		case 5:
			numDays = 30;
			break;
		case 6:
			numDays = 31;
			break;
		case 7:
			numDays = 31;
			break;
		case 8:
			numDays = 31;
			break;
		case 9:
			numDays = 30;
			break;
		case 10:
			numDays = 31;
			break;
		case 11:
			numDays = 30;
			break;
		case 12:
			numDays = 31;
			break;
		default :
			System.out.println("Invalid Month Provided");
			
		}
		return numDays;
	}

}
