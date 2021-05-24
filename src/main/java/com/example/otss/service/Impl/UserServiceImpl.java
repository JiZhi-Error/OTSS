package com.example.otss.service.Impl;

import com.example.otss.dao.UserDao;
import com.example.otss.entity.Users;
import com.example.otss.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(Users user) {
        userDao.save(user);
    }

    @Override
    public List<Users> findAll() {
        return userDao.findAll();
    }

    @Override
    public void deleteUserById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public Users findUserById(int id) {
        return userDao.findUserByUserId(id);
    }
}
