package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeToDoListApplication {

	public static void main(String[] args) {
		// Creating a employee = TODO LIST Management System,
		
		//Backend: Spring Boot, Spring MVC, Spring Data JPA
		//Database: MySQL
		//Frontend (UI): Thymeleaf (Optional: Can also integrate with React/HTML/CSS), bootstrap for styling
		//Tools: Maven, Eclipse/IntelliJ, Postman (for API testing)
		
		/*
- Built RESTful services to handle all CRUD operations and integrated MySQL using Spring Data JPA.
- Designed a responsive Thymeleaf UI to interact with the backend,
- Used Postman for API testing and Maven for dependency management.
*/

		System.out.println("This is Employee Todo project");

		SpringApplication.run(EmployeeToDoListApplication.class, args);

		System.out.println("After creating deploye using DOCKER...");
	}

}
