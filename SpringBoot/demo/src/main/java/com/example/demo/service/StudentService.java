package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	int addNewStudent(Student student);
	
	Student getStudent(Long id);
	
	List<Student> getStudents();
	
	int deleteStudent(Long id);
}
