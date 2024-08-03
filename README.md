# Student_Management

Project Description
This project is a basic Spring Boot application that demonstrates the use of Spring MVC, Spring Security with JWT, and Spring Data JPA. The application includes two entities, Student and Subject, with a many-to-many relationship between them. The project also provides a REST API layer for creating and retrieving students and subjects, and it uses an in-memory H2 database for persistence.

Technologies Used
Spring Boot
Spring MVC
Spring Security (JWT)
Spring Data JPA
MySql Database
Maven
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.jpa.defer-datasource-initialization=true

Note: Replace mydatabase with the name of your MySQL database, and yourpassword with your MySQL password.


Running the Application
Clone the repository.
Navigate to the project directory.
Create a MySQL database named mydatabase (or another name as configured in application.properties).
Run the application using the command: mvn spring-boot:run.

Testing the API
Use Postman or any API testing tool to test the endpoints.
Available endpoints:
POST /api/students - Create a new student.
GET /api/students - Get a list of all students.
GET /api/subjects - Get a list of all subjects.
