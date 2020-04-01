package com.mymvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int year;
	
	public Student() {}
	
	public Student(int studentId, String firstname, String lastname, int year) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
