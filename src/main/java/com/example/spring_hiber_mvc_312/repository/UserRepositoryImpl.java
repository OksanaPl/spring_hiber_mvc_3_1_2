package com.example.spring_hiber_mvc_312.repository;

import com.example.spring_hiber_mvc_312.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(String firstName, String lastName) {
        User user = new User(firstName, lastName);
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User updated) {
        entityManager.merge(updated);
    }

    @Override
    public void deleteById(Long id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

}




