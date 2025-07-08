# 🧑‍💼 Spring Boot User Management API

A clean and production-ready user management API built with **Spring Boot**, featuring **Redis caching** using Spring Cache (Lettuce), layered architecture, and RESTful design with core concepts like:

- CRUD operations
- Interface-based service layer
- Spring Data JPA
- H2 in-memory database
- Exception handling
- Clean code architecture

---

## 🚀 Features

- ✅ Create, read, update, and delete users (CRUD)
- 🚀 Fast `getUserById` with Redis caching
- 🧱 Layered architecture: Controller → Service → Repository
- 💾 Spring Data JPA with H2/MySQL/PostgreSQL
- 🛡️ Input validation
- ⚙️ Configurable Redis integration using **Lettuce** (default)

---

## 💡 Redis Caching

This project uses Spring's caching abstraction with Redis to optimize lookup performance for individual users:

``java
@Cacheable(cacheNames = "users", key = "#id")
public User getUserById(Long id) { ... }

---

## 🛠️ Tech Stack

| Layer        | Technology              |
|--------------|--------------------------|
| Framework    | Spring Boot              |
| Database     | H2 (default) / MySQL     |
| ORM          | Spring Data JPA          |
| Caching      | Redis + Spring Cache (Lettuce) |
| Validation   | Hibernate Validator       |
| Build Tool   | Maven                    |

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
