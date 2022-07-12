package com.zensar.StudentManagement.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// ess code ko run karne k liye client3 vali  class ko run karna hoga
import com.zensar.StudentManagement.entity.Student2;


public class DbStudent implements StudentRepository {
	
	
	@Override
	public int insert(Student2 student) {
		try(Connection con=ConnectionProvider.getConnection();
				Statement stm = con.createStatement();) {
			int count=stm.executeUpdate("insert into student values("+student.studentId+",'"+student.studentName+"',"+student.studentAge+");");
				
				if (count > 0) {
				System.out.println("insert successfully");
				} else
				System.out.println("not insert successfully");
				} catch (SQLException e) {
				e.printStackTrace();
				}
				return student.studentId;
				
	}

	@Override
	public Student2[] displayAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		try(Connection con=ConnectionProvider.getConnection();
				Statement stm = con.createStatement();) {
			int count=stm.executeUpdate("DELETE FROM student WHERE studentId=" + id + "");
				
				if (count > 0) {
				System.out.println("insert successfully");
				} else
				System.out.println("not insert successfully");
				} catch (SQLException e) {
				e.printStackTrace();
				}
				
	}

	@Override
	public void updateStudnet(int id) {
		// TODO Auto-generated method stub
		try(Connection con=ConnectionProvider.getConnection();
				Statement stm = con.createStatement();) {
			String name=null;
			int Id =0;;
			int age=0;
			//int count=stm.executeUpdate("UPDATE student SET studentId = '"+id+"' WHERE studentId = "+id+"");
			int count=stm.executeUpdate("UPDATE student SET studentName = '"+name+"',studentAge="+age+" WHERE studentId = "+id+"");
	
				
				if (count > 0) {
				System.out.println("insert successfully");
				} else
				System.out.println("not insert successfully");
				} catch (SQLException e) {
				e.printStackTrace();
				}
				
	}

	@Override
	public void findStudent(int id) {
		// TODO Auto-generated method stub
		
	}

}
