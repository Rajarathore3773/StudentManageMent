package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student2;

public interface StudentService {

	int acceptStudent(int studentId, String studentName, int studentAge);
	
	Student2 [] displayAllStudent();
	
	void deleteStudent(int id);
	void updateStudnet(int id);
	void  findStudent(int id);
}
