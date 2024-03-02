# Electronic Commerce System (Backend)

This project is a backend application in Java using the Spring Boot framework. The application follows the RESTful architectural model, where the API responds to HTTP requests, thus creating an "Electronic Commerce System" scenario.

## Conceptual Model:

![image](https://github.com/AlexFerreira10/Web-services-com-Spring-Boot-e-JPA-Hibernate-/assets/143446470/74ae3e5c-6dbe-4b20-8c11-4cc3fa624a05)

## Main Components:

- **Entities:** The main entities of the system include User, Product, Payment, OrderItem, Order, Category, which are mapped to tables in the database.

- **Repositories:** JPA Repositories provide methods to access and manipulate data in the database for each entity.

- **Services:** Services contain the business logic related to each entity, coordinating operations between controllers and repositories.
  
- **REST Controllers:** REST controllers provide endpoints to access and manipulate system resources through HTTP requests, following the principles of the RESTful architectural model.

## Program Flow:

The program follows a simple flow, where HTTP requests are processed by REST controllers, which interact with corresponding services to perform business operations and access data in the database. Here's an overview of the program flow:

1. **Interacting with the Client:**
   - The flow begins when a client (e.g., a web browser or an application) sends an HTTP request to the API.

2. **Arrival at the Server:**
   - The HTTP request arrives at the application server, where it is routed to the corresponding REST controller based on the endpoint specified in the URL.

3. **Processing in the Controllers:**
   - In the REST controllers, requests are mapped to specific methods corresponding to the specified endpoints. Controllers are responsible for input validation, calling the appropriate services, and preparing the response.

4. **Calls to Services:**
   - Controllers call relevant services, which contain business logic related to the request. Services coordinate operations between controllers and data repositories.

5. **Accessing Data in the Database:**
   - Services access the necessary data in the database through JPA repositories. Repositories provide methods to perform CRUD operations in the database.

6. **Preparing the Response:**
   - Once business operations are completed and data is retrieved or manipulated as needed, an HTTP response is prepared. This typically involves serializing data into a suitable format, such as JSON.

7. **Sending the Response to the Client:**
   - The HTTP response is sent back to the client that made the request, providing the requested data or confirmation of the operation's success.

8. **Completion of the Flow:**
   - The flow is completed when the response is delivered to the client, and communication between the client and server is terminated. The client can then use the provided data or perform further interactions, depending on the system requirements.

## Technologies used

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- PostgresSQL
- Postman
- Apache Tomcat
- H2

## How to use:

1. **Environment Configuration:**
   - Make sure you have Java and Spring Boot installed on your machine.

2. **Cloning the Repository:**
   - Clone this repository to your local machine.

3. **Running the Application:**
   - Navigate to the project root directory and run the command `./mvnw spring-boot:run` to start the application.

4. **Interacting with the API:**
   - Use tools like Postman to send HTTP requests to your API endpoints and view the responses.

## Author

- Douglas Alexsander Ferreira Corrêa
- www.linkedin.com/in/alexferreira92
