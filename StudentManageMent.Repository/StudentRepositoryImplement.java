package com.zensar.StudentManagement.repository;

import java.util.Scanner;

import com.zensar.StudentManagement.entity.Student2;

public class StudentRepositoryImplement implements StudentRepository {

	Student2 [] student = new Student2[5];
	int counter=0;
	
	@Override
	public int insert(Student2 student) {
		this.student[counter++]= student;
		return student.getStudentId();
	}

	@Override
	public Student2[] displayAllStudent() {
		
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		for(int i=0;i<student.length;i++) {
			if(id==student[i].getStudentId()) {
				for(int j=i;j<student.length-1;j++) {
				student[j]=student[j+1];	
				}
				break;
			}
			else {
				try {
					throw new IdNotFoundException();
				}catch(IdNotFoundException e) {
					System.out.println("id not found");
				}
				
			}
		}
		
	}

	@Override
	public void updateStudnet(int id) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			if(student[i]!=null&&id==student[i].getStudentId()) {
				System.out.println("Enter updated Name ");
				student[i].setStudentName(sc.nextLine());
				System.out.println("Enter updated Age ");
				student[i].setStudentAge(sc.nextInt());
				
				
			}
			break;
		}
	}

	@Override
	public void findStudent(int id) {
		for(int i=0;i<student.length;i++) {
			if(student[i]!=null&&id==student[i].getStudentId()) {
				System.out.println("Id found");
				break;
			}
			else {
			System.out.println("Id not Found");	
			}
		}
		
	}

}
