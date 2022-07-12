package com.zensar.StudentManagement.repository;

import com.zensar.StudentManagement.entity.Student2;

public interface StudentRepository {

   int insert(Student2 student );
	
	Student2 [] displayAllStudent();
	
	void deleteStudent(int id);
	void updateStudnet(int id);
	void  findStudent(int id);
}
