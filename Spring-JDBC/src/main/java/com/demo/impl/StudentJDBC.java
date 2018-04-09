package com.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

public class StudentJDBC implements StudentDao {
	
	
	private DataSource dataSource;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Student student) {
		
		String sql = "INSERT INTO STUDENT " +
				"(studentId, studentName, studentAge) VALUES (?, ?, ?)";
		
		java.sql.Connection conn = null;
		
		try {
			conn =dataSource.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1, student.getStuId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getAge());
			
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Student findByStudentId(int studId) {
		
		String sql = "SELECT * FROM STUDENT WHERE studentId = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, studId);
			
			Student student=null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student=new Student(student.getStuId(),student.getName(),student.getAge());
			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

}
