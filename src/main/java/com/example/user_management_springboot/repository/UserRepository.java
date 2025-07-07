package com.example.user_management_springboot.repository;


import com.example.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // built-in CRUD methods
}