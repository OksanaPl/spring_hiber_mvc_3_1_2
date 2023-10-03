package com.example.spring_hiber_mvc_312.service;

import com.example.spring_hiber_mvc_312.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteById(Long id);
}
