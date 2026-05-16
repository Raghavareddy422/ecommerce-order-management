# E-Commerce Order Management System

## Live Demo
https://ecommerce-order-management-9hkc.onrender.com

## GitHub Repository
https://github.com/Raghavareddy422/ecommerce-order-management

## Overview
E-Commerce Order Management System is a backend REST API application developed using Java and Spring Boot to simulate the core operations of a modern e-commerce platform. The system manages products, customers, and order transactions through RESTful APIs while maintaining inventory consistency and structured database persistence.

The application follows enterprise backend design principles and provides a scalable foundation for future enhancements such as authentication, payment gateway integration, frontend development, and containerized deployment.

---

## Features

### Product Management
- Add new products
- Retrieve all products
- Retrieve product by ID
- Delete products
- Maintain inventory stock quantity

### Customer Management
- Register new customers
- Retrieve all customers
- Retrieve customer by ID
- Delete customers

### Order Management
- Place orders
- Validate customer existence
- Validate product availability
- Check stock quantity before order
- Automatically reduce stock after successful order
- Store order transaction history

### Backend Features
- RESTful API architecture
- Layered project structure
- DTO-based request handling
- Centralized exception handling
- JPA repository abstraction
- Hibernate ORM persistence
- Cloud-hosted relational database
- Public deployment

---

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM

### Database
- MySQL
- Aiven Cloud MySQL Hosting

### API Testing
- Postman

### Version Control
- Git
- GitHub

### Deployment
- Render Cloud Hosting

### Build Tool
- Gradle

### Development Environment
- IntelliJ IDEA

---

## System Architecture

The application follows layered architecture for clean separation of responsibilities.

Client Layer:
- Postman
- Future frontend applications
- Mobile clients

Controller Layer:
Handles incoming HTTP requests and API routing.

Service Layer:
Contains business logic implementation.

Repository Layer:
Handles database access through JPA repositories.

Persistence Layer:
Hibernate ORM + MySQL database.

Deployment Layer:
Render cloud hosting + Aiven cloud database.

Architecture Flow:

Client (Postman / Frontend)
        ↓
REST Controllers
        ↓
Service Layer
        ↓
Repository Layer
        ↓
Hibernate / JPA
        ↓
MySQL Database
        ↓
Cloud Deployment (Render)

---

## Project Structure

```text
src/main/java/com/raghava/ecommerceordermanagement
│
├── controller
│   ├── ProductController.java
│   ├── CustomerController.java
│   └── OrderController.java
│
├── service
│   ├── ProductService.java
│   ├── CustomerService.java
│   └── OrderService.java
│
├── repository
│   ├── ProductRepository.java
│   ├── CustomerRepository.java
│   └── OrderRepository.java
│
├── entity
│   ├── Product.java
│   ├── Customer.java
│   └── OrderEntity.java
│
├── dto
│   ├── ProductDTO.java
│   ├── CustomerDTO.java
│   └── OrderDTO.java
│
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ProductNotFoundException.java
│
└── EcommerceOrderManagementApplication.java
```

---

## API Endpoints

## Product APIs

### Add Product
POST /products

Request:
```json
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "stockQuantity": 10
}
```

### Get All Products
GET /products

### Get Product By ID
GET /products/{id}

### Delete Product
DELETE /products/{id}

---

## Customer APIs

### Add Customer
POST /customers

Request:
```json
{
  "name": "Raghava",
  "email": "raghava@gmail.com",
  "phone": "9876543210",
  "address": "Hyderabad"
}
```

### Get All Customers
GET /customers

### Get Customer By ID
GET /customers/{id}

### Delete Customer
DELETE /customers/{id}

---

## Order APIs

### Place Order
POST /orders

Request:
```json
{
  "productId": 1,
  "customerId": 1,
  "quantity": 2
}
```

Business flow:
- Check customer existence
- Check product existence
- Validate stock
- Calculate total amount
- Reduce inventory
- Save order

### Get All Orders
GET /orders

### Get Order By ID
GET /orders/{id}

---

## Database Design

### Product Table
Fields:
- id
- name
- description
- price
- stock_quantity

### Customer Table
Fields:
- id
- name
- email
- phone
- address

### Order Table
Fields:
- id
- quantity
- total_amount
- customer_id
- product_id

---

## ER Relationship

Customer
(1)
 |
 | places
 |
(M)
Order
(M)
 |
 | contains
 |
(1)
Product

Meaning:
- One customer can place multiple orders
- One product can exist in multiple orders
- Each order belongs to one customer
- Each order references one product

---

## Business Logic

### Product Service
Responsible for:
- product creation
- retrieval
- deletion
- repository interaction

### Customer Service
Responsible for:
- customer registration
- retrieval
- persistence management

### Order Service
Responsible for:
- retrieving customer
- retrieving product
- validating entity existence
- validating stock
- calculating total cost
- updating inventory
- saving order

---

## Exception Handling

Centralized exception handling improves API reliability.

Handled scenarios:
- product not found
- invalid requests
- insufficient stock
- entity lookup failures

Implemented using:
- @RestControllerAdvice
- @ExceptionHandler

---

## Local Setup

### Clone Repository
```bash
git clone https://github.com/Raghavareddy422/ecommerce-order-management.git
cd ecommerce-order-management
```

### Configure Database
Update application.properties:

```properties
spring.datasource.url=your_database_url
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run Application
```bash
./gradlew bootRun
```

Application URL:
http://localhost:8080

---

## Deployment

The application is deployed using Render.

Live URL:
https://ecommerce-order-management-9hkc.onrender.com

Cloud database:
Aiven MySQL

Deployment workflow:
- local development
- Git initialization
- GitHub push
- cloud database creation
- environment variable configuration
- Render deployment
- production debugging

Environment variables:
- DB_URL
- DB_USERNAME
- DB_PASSWORD
- PORT

---

## Challenges Solved

- Git setup
- GitHub authentication
- Gradle build issues
- Java version mismatch
- environment variable configuration
- JDBC URL setup
- cloud database connectivity
- deployment debugging
- API validation

---

## Future Enhancements

- JWT Authentication
- Role-based authorization
- Payment gateway integration
- Shopping cart module
- Order history dashboard
- Admin panel
- Swagger/OpenAPI documentation
- Docker containerization
- Kubernetes deployment
- CI/CD automation
- Monitoring and logging
- React frontend
- Mobile integration

---

## Author

Raghava Reddy  
Parul University  
Computer Science Engineering
