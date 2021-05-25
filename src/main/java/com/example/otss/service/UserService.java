package com.example.otss.service;

import com.example.otss.entity.Age;
import com.example.otss.entity.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    List<User> findAll();

    void deleteUserById(long id);

    User findUserById(int id);

    List<Age> getUsersAllAgePie();
    List<Integer> getUsersAllAgeLine();

}
