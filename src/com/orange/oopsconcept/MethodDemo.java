package com.orange.oopsconcept;

public class MethodDemo { // to avoid redundant code we may need to use methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName = "john";
		int studentMark = 90;
		char studentGrade;
	
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
		
		studentName = "jency";
		studentMark = 80;
		
		
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
