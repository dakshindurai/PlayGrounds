package com.orange.oopsconcept;

public class MethodsfindGrade {
	
//	static String studentName;
//	static int studentMark;
	
	
	public static void main(String[] args) {
		findGrades("john", 90);
		findGrades("jency", 70);
		findGrades("johan",100);
	}
	private static void findGrades(String studentName, int studentMark) {
		
		char  studentGrade;
		if (studentMark >= 90 && studentMark <= 100) {
			studentGrade = 'A';
			System.out.println("Student "+ studentName +" got Grade: "+ studentGrade);
		}else if (studentMark >= 80 && studentMark <= 90) {
			studentGrade = 'B';
			System.out.println("Student "+ studentName +" got Grade: "+ studentGrade);
		}else if (studentMark >= 70 && studentMark <= 80) {
			studentGrade = 'C';
			System.out.println("Student "+ studentName +" got Grade: "+ studentGrade);
		}else {
			studentGrade = 'D';
			System.out.println("Student "+ studentName +" got Grade: "+ studentGrade);
		}
	}
}
