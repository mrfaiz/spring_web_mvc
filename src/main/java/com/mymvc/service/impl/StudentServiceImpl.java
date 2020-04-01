package com.mymvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mymvc.dao.StudentDao;
import com.mymvc.model.Student;
import com.mymvc.service.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		studentDao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		studentDao.edit(student);

	}

	@Transactional
	public void delete(int studentId) {
		studentDao.delete(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

}
