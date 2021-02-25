package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/**
	 * path:http://127.0.0.1:8080
	 * @return
	 */
	@GetMapping
	public String hello() {
		return "hello world!";
	}
	
	/**
	 * path:http://127.0.0.1:8080/api/books/list
	 * @return
	 */
	@GetMapping(path = "api/books/list")
	public List<String> getBooks(){
		return List.of("java", "c++", "javascript");
	}


}
