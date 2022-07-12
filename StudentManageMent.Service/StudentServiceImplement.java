package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student2;
import com.zensar.StudentManagement.repository.StudentRepository;
import com.zensar.StudentManagement.repository.StudentRepositoryImplement;
import com.zensar.StudentsManagement.client.StudentcollectionRepository;

public class StudentServiceImplement implements StudentService {
	
	
	//StudentRepository studentrpository = new StudentRepositoryImplement();
	
	StudentRepository studentrpository = new StudentcollectionRepository();
	

	@Override
	public int acceptStudent(int studentId, String studentName, int studentAge) {
		Student2 newStudent = new Student2(studentId, studentName, studentAge);
		studentrpository.insert(newStudent);
		return studentId;
	}

	@Override
	public Student2[] displayAllStudent() {
		
		return studentrpository.displayAllStudent();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentrpository.deleteStudent(id);
	}

	@Override
	public void updateStudnet(int id) {
		// TODO Auto-generated method stub
		studentrpository.updateStudnet(id);
	}

	@Override
	public void findStudent(int id) {
		// TODO Auto-generated method stub
		studentrpository.findStudent(id);
	}

	
	

}
