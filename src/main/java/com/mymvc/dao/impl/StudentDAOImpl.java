package com.mymvc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mymvc.dao.StudentDao;
import com.mymvc.model.Student;

@Repository
public class StudentDAOImpl implements StudentDao{

	@Autowired
	SessionFactory session;
	
	public void add(Student student) {
		session.getCurrentSession().save(student);
		
	}

	public void edit(Student student) {
		session.getCurrentSession().update(student);
		
	}

	public void delete(int studentId) {
	  session.getCurrentSession().delete(getStudent(studentId));
		
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return (Student)session.getCurrentSession().get(Student.class,studentId);
	}

	public List getAllStudent() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from student").list();
	}

}
