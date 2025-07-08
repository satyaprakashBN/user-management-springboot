package com.example.user_management_springboot.service;


import com.example.user_management_springboot.entity.User;
import com.example.user_management_springboot.repository.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll(); // you can use stream here
    }

    @Override
    @Cacheable(cacheNames = "users", key = "#id")
    public User getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    @CacheEvict(cacheNames = "users", key = "#id")

    public User updateUser(Long id, User updatedUser) {
        return userRepo.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepo.save(user);
        }).orElse(null);
    }

    @Override
    @CacheEvict(cacheNames = "users", key = "#id")

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}


