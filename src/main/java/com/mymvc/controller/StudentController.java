package com.mymvc.controller;

import java.awt.Desktop.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mymvc.model.Student;
import com.mymvc.service.StudentServices;

@Controller
public class StudentController {

	@Autowired
	private StudentServices studentServices;

	@RequestMapping("/index")
	public String initForm(java.util.Map<String, Object> map) {
		System.out.println("index-------------------------");
		Student stu = new Student();
		map.put("student", stu);
		map.put("studentList", studentServices.getAllStudent());
		return "student";
	}

	@RequestMapping(value = "/student.do", method = RequestMethod.POST)
	public String doAction(@ModelAttribute Student student, BindingResult bindingResult, String action,
			java.util.Map<String, Object> map) {
		Student resultedStudent = new Student();
		if (action.toLowerCase().equals("add")) {
			studentServices.add(student);
			resultedStudent = student;
		} else if (action.toLowerCase().equals("edit")) {
			studentServices.edit(student);
			resultedStudent = student;
		} else if (action.toLowerCase().equals("delete")) {
			studentServices.delete(student.getStudentId());
		} else if (action.toLowerCase().equals("search")) {
			Student st = studentServices.getStudent(student.getStudentId());
			resultedStudent = st != null ? st : new Student();
		}

		map.put("student", resultedStudent);
		map.put("studentList", studentServices.getAllStudent());

		return "student";
	}
}
