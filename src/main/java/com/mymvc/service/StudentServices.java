package com.mymvc.service;

import com.mymvc.model.Student;

public interface StudentServices {
	void add(Student student);
	void edit(Student student);
	void delete(int studentId);
	Student getStudent(int studentId);
	java.util.List getAllStudent();
}
