package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	int addNewStudent(Student student);
	
	Student getStudent(Long studentId);
	
	List<Student> getStudents();
	
	void deleteStudent(Long studentId);

	void updateStudent(Long studentId, String name, String email);
}
