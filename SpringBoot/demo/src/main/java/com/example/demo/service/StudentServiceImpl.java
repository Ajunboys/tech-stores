package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public int addStudent(Student student) {
		return 0;
	}

	@Override
	public Student getStudent(Long id) {
		return null;
	}

	@Override
	public List<Student> getStudents() {
		return List.of(
				new Student(202008122L, "Tina", "tina@gmail.com", LocalDate.of(1998, 6, 18), 23),
				new Student(202008132L, "Bruce", "bruce.vip@gmail.com", LocalDate.of(1998, 6, 18), 23),
				new Student(202008169L, "Jason", "jason.b4u@gmail.com", LocalDate.of(1998, 10, 25), 23),
				new Student(202008181L, "Meiri", "meiri@gmail.com", LocalDate.of(1999, 8, 8), 22)
				);
	}

	@Override
	public int deleteStudent(Long id) {
		return 0;
	}

}
