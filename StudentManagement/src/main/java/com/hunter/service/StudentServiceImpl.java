package com.hunter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hunter.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	
	public List<Student> students = Arrays.asList(new Student("Venky","Asshole"),
		new Student("Aemson","Kerala"));
	

	@Override
	public List<Student> getAllStudent() {
		
		return students;
	}


	@Override
	public Student getStudent(String name) {
		
		return students.stream().filter(p->p.getName().equalsIgnoreCase(name)).findFirst().get();
	}

}
