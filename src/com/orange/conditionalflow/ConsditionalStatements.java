package com.orange.conditionalflow;

public class ConsditionalStatements {

	static int score = 82;
	static String grade;
	
	public static void main(String[] args) {
		if (score  > 90 && score <= 100) {
			grade = "A";
		} else if (score > 80 && score <= 90 ) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println("Score is : " + score);
		System.out.println("Grade is : " + grade);
	}			
	
}
