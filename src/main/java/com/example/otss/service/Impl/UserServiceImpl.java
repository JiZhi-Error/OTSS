package com.example.otss.service.Impl;

import com.example.otss.dao.UserDao;
import com.example.otss.entity.User;
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
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
