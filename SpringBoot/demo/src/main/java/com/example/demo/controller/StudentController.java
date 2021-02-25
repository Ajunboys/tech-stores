package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;

@RestController
@RequestMapping(path = "api/V1/students")
public class StudentController {
	
	private StudentService studentService;

	public StudentController() {
		this.studentService = new StudentServiceImpl();
	}
	
	/**
	 * http://127.0.0.1:8080/api/students
	 * @return
	 */
	@GetMapping
	public List<Student> getStudents(){
		return  studentService.getStudents();
	}
}
