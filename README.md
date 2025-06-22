# Employee TODO Management System

## Project Overview

A full-stack Spring Boot web application that allows you to **manage employees and their task lists (TODOs)** using CRUD operations. Designed with a layered Spring MVC architecture, RESTful routing, and a responsive frontend using Thymeleaf and Bootstrap.

> This project showcases end-to-end web development using Spring MVC, RESTful API design, and a responsive UI — ideal for job portfolios.

## 🚀 Features

- ➕ Add, update, and delete employee records
- 📋 Display all employees in a structured, sortable table
- ✅ Assign and manage TODO tasks for each employee
- 🔄 Spring MVC architecture with clean RESTful controllers
- 🎨 Responsive UI with Bootstrap and Thymeleaf
- 💾 Integrated with MySQL via Spring Data JPA

## 🛠️ Technologies Used
Backend: Java with Spring Boot
Frontend: Thymeleaf and Bootstrap
Database: MySQL (using JPA for database access)
Build Tool: Maven
Containerization: Docker
IDE: Eclipse or Spring Tool Suite (STS)

## 📁 Folder Structure

src/
└── main/
├── java/com/example/employee/
│ ├── controller/ # Handles web requests
│ ├── model/ # Entity classes
│ ├── repository/ # JPA interfaces
│ ├── service/ # Business logic
│ └── dto/ # Data transfer objects (optional)
└── resources/
├── templates/ # Thymeleaf HTML views
├── static/ # CSS, JS, images
└── application.properties

## ⚙️ How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/employee-todo-system.git
   cd employee-todo-system

2.Configure database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3. Run the application

./mvnw spring-boot:run

4. Access the app

Navigate - http://localhost:8080/employees


## 🙋‍♂️ Author

**Kartik Sharma**  
Java Developer | Spring Boot Enthusiast

[🔗 LinkedIn]([https://www.linkedin.com/in/your-profile](https://www.linkedin.com/in/kartiksharma-tech-enthusiast/))

⭐ Star this repo if you found it helpful. Contributions and suggestions are welcome!
