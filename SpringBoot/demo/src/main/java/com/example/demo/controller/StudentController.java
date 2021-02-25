package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping(path = "api/V1/students")
public class StudentController {
	
	
	/**
	 * http://127.0.0.1:8080/api/students
	 * @return
	 */
	@GetMapping
	public List<Student> getStudents(){
		return List.of(
				new Student(202008132L, "Bruce", "bruce.vip@gmail.com", LocalDate.of(1998, 6, 18), 23),
				new Student(202008169L, "Jason", "jason.b4u@gmail.com", LocalDate.of(1998, 10, 25), 23),
				new Student(202008181L, "Meiri", "meiri@gmail.com", LocalDate.of(1999, 8, 8), 22)
				) ;
	}
}
