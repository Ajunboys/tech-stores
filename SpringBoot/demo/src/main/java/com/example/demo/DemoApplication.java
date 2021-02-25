package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 正式使用时，主入口不推荐使用控制器，应在对应的业务控制器(类)中使用*
 */
@SpringBootApplication
//@RestController //正式使用时，主入口不推荐使用控制器，应在对应的业务控制器(类)中使用
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//	@GetMapping //path:http://127.0.0.1:8080
	public String hello() {
		return "hello world!";
	}
	
//	@GetMapping(path = "api/books/list") //path:http://127.0.0.1:8080/api/books/list
	public List<String> getBooks(){
		return List.of("java", "c++", "javascript");
	}


}
