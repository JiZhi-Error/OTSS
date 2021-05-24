package com.example.otss.service;

import com.example.otss.entity.Users;

import java.util.List;

public interface UserService {

    void createUser(Users user);

    List<Users> findAll();

    void deleteUserById(long id);

    Users findUserById(int id);

}
