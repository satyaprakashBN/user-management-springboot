# 🧑‍💼 Spring Boot User Management API

This is a simple **User Management REST API** built with **Spring Boot**, demonstrating core concepts like:
- CRUD operations
- Interface-based service layer
- Spring Data JPA
- H2 in-memory database
- Exception handling
- Clean code architecture

---

## 🚀 Features

- Create new users
- View all users
- Get a user by ID
- Update existing users
- Delete users
- Built using interfaces and abstraction
- Stream API demo included

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 📦 API Endpoints

| Method | Endpoint       | Description         |
|--------|----------------|---------------------|
| POST   | `/users`       | Create new user     |
| GET    | `/users`       | Get all users       |
| GET    | `/users/{id}`  | Get user by ID      |
| PUT    | `/users/{id}`  | Update user by ID   |
| DELETE | `/users/{id}`  | Delete user by ID   |

---

## 🧪 Sample Request Body (POST / PUT)

```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
