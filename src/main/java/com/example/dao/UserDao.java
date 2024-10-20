package com.example.dao;

import com.example.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();
}
