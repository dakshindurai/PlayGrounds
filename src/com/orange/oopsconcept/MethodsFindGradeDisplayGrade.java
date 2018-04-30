package com.orange.oopsconcept;

public class MethodsFindGradeDisplayGrade {

	public static void main(String[] args) {
		char studentGrade;
		String studentName;
		studentName = "john";
		studentGrade = findGrade(90);
		displayGrade (studentName, studentGrade);
		
		studentName = "jency";
		studentGrade = findGrade(80);
		displayGrade (studentName, studentGrade);
	}
	private static char findGrade(int studentMark) {
		char studentGrade;
		if (studentMark >= 90 && studentMark <= 100) {
			studentGrade = 'A';
		}else if (studentMark >= 80 && studentMark <= 90) {
			studentGrade = 'B';
		}else if (studentMark >= 70 && studentMark <= 80) {
			studentGrade = 'C';
		}else {
			studentGrade = 'D';
		}return studentGrade;
	}
	private static void displayGrade(String studentName, char studentGrade) {
		System.out.println("Student : "+ studentName + " got grade "+ studentGrade);
	}

}
