package com.hunter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hunter.model.Student;
import com.hunter.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String getStatus()
	{
		return "Success";
	}
	
	@RequestMapping(path = "/getStudents",method = RequestMethod.GET)
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
		
	}
	
	@RequestMapping(path = "/getStudent/{name}",method = RequestMethod.GET)
	public Student getStudent(@PathVariable String name)
	{
		return studentService.getStudent(name);
		
	}

}
