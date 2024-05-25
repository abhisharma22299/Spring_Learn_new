package com.spring.orm.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentcity;

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

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	public Student(int studentId, String studentName, String studentcity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentcity = studentcity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
