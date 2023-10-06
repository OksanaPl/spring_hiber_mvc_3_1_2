package com.example.spring_hiber_mvc_312.service;

import com.example.spring_hiber_mvc_312.model.User;
import com.example.spring_hiber_mvc_312.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.addUser(user.getFirstName(), user.getLastName());
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
       return userRepository.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
      userRepository.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
       userRepository.deleteById(id);
    }

}
