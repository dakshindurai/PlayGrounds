package com;

public class Student {
    private String studentName;
    private int rollNo;

    public String getStudentName() {
        if (studentName == "Durai") {
            return studentName;
        } else {
            studentName = "NoName";
        }
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

