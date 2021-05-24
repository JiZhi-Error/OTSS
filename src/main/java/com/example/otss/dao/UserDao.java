package com.example.otss.dao;

import com.example.otss.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<Users,Long> {

    Users findUserByUserId(long id);

}
