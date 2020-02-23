package com.hunter.service;

import java.util.List;

import com.hunter.model.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	public Student getStudent(String name);
}
