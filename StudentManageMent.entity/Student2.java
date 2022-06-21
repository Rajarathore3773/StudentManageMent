package com.zensar.StudentManagement.entity;

public class Student2 {
	public int studentId;
	public String studentName;
	public int studentAge;

	public Student2() {
	super();
	}

	public Student2(int studentId, String studentName, int studentAge) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	
	}

}
