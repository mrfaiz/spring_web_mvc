package com.mymvc.dao;

import com.mymvc.model.Student;

public interface StudentDao {
	void add(Student student);
	void edit(Student student);
	void delete(int studentId);
	Student getStudent(int studentId);
	java.util.List getAllStudent();
	
}
