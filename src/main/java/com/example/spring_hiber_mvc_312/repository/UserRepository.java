package com.example.spring_hiber_mvc_312.repository;

import com.example.spring_hiber_mvc_312.model.User;
import java.util.List;

public interface UserRepository {

    void addUser(String firstName, String lastName);

    List<User> getAllUsers();

    void updateUser(User user);

    User getUserById(Long id);

    void deleteById(Long id);

}

