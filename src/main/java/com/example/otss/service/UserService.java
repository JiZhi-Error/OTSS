package com.example.otss.service;

import com.example.otss.entity.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    List<User> findAll();

    void deleteUserById(int id);

    User findUserById(int id);

}
