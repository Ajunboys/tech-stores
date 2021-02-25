package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	@Override
	public int addNewStudent(Student student) {
		System.out.println("add new student.");
		return 0;
	}

	@Override
	public Student getStudent(Long id) {
		return null;
	}

	@Override
	public List<Student> getStudents() {
//		return List.of(
//				new Student(202008122L, "Tina", "tina@gmail.com", LocalDate.of(1998, 6, 18), 23),
//				new Student(202008132L, "Bruce", "bruce.vip@gmail.com", LocalDate.of(1998, 6, 18), 23),
//				new Student(202008169L, "Jason", "jason.b4u@gmail.com", LocalDate.of(1998, 10, 25), 23),
//				new Student(202008181L, "Meiri", "meiri@gmail.com", LocalDate.of(1999, 8, 8), 22)
//				);
		return studentRepository.findAll();
	}

	@Override
	public int deleteStudent(Long id) {
		return 0;
	}

}
