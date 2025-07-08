package com.example.user_management_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UserManagementSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSpringbootApplication.class, args);
	}

}
