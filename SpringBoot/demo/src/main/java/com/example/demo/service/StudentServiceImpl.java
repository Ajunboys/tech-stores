package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		
		Optional<Student> studentOptional = studentRepository.
				findStudentByEmail(student.getEmail());
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		
		studentRepository.save(student);
		
		return 0;
	}

	@Override
	public Student getStudent(Long studentId) {
		Optional<Student> studentOptional = studentRepository.findById(studentId);
		if (studentOptional != null) 
			return studentOptional.get();
		else 
			throw new IllegalStateException("student with id " + 
					studentId + " does not exists");
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
	public void deleteStudent(Long studentId) {
		boolean exists = studentRepository.existsById(studentId);
		if (!exists) {
			throw new IllegalStateException("student with id " + 
					studentId + " does not exists");
		}
		studentRepository.deleteById(studentId);		
	}
	
	@Transactional
	@Override
	public void updateStudent(Long studentId, 
			String name, 
			String email) {
		Student student = studentRepository.findById(studentId)
				.orElseThrow(() -> new IllegalStateException(
						"student with id " + 
						studentId + " does not exists"));
		
		if (name != null && 
				name.length() > 0 && 
				!Objects.equals(student.getName(), name)) {
			student.setName(name);
		}
		
		if (email != null && 
				email.length() > 0 && 
				!Objects.equals(student.getEmail(), email)) {
			Optional<Student> studentOptional = studentRepository
					.findStudentByEmail(email);
			if (studentOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			student.setEmail(email);
		}
		
		
	}

}
