package com.example.otss.dao;

import com.example.otss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Integer> {

    User findUserById(int id);

}
