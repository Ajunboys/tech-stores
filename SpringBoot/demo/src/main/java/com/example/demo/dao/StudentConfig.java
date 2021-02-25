package com.example.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Student;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(
			StudentRepository repository) {
		return args -> {
			
			Student jason = new Student(
					"Jason", 
					"jason.b4u@gmail.com", 
					LocalDate.of(1998, 10, 25)
			);
			
			Student tina = new Student(
					"Tina", 
					"tina@gmail.com", 
					LocalDate.of(1998, 6, 18)
			);
			
			Student bruce = new Student(
					"Bruce", 
					"bruce.vip@gmail.com", 
					LocalDate.of(1998, 6, 18)
			);
			
			Student meiri = new Student(
					"Meiri", 
					"meiri@gmail.com", 
					LocalDate.of(1999, 8, 8) 
			);
			
			repository.saveAll(
					List.of(jason, bruce, tina, meiri)
					);
		};
	}
}
