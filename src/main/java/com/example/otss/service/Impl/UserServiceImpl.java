package com.example.otss.service.Impl;

import com.example.otss.dao.UserDao;
import com.example.otss.entity.Age;
import com.example.otss.entity.User;
import com.example.otss.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public void deleteUserById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserByUserId(id);
    }

    @Override
    public List<Age> getUsersAllAgePie() {
        ArrayList<Integer> ages = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<User> users = findAll();
        for (User user : users) {
            ages.add(user.getAge());
        }

        for (Integer age : ages) {
            if (map.containsKey(age)) {
                map.put(age, map.get(age) + 1);
            } else {
                map.put(age, 1);
            }
        }
        map.remove(0);
        List<Age> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            Age age = new Age();
            age.setName(mapKey);
            age.setValue(mapValue);
            list.add(age);
        }
        return list;
    }

    @Override
    public List<Integer> getUsersAllAgeLine() {
        ArrayList<Integer> ages = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        List<User> users = findAll();
        for (User user : users) {
            ages.add(user.getAge());
        }

        for (Integer age : ages) {
            if (map.containsKey(age)) {
                map.put(age, map.get(age) + 1);
            } else {
                map.put(age, 1);
            }
        }
        map.remove(0);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer mapValue = entry.getValue();
            list.add(mapValue);
        }
        return list;
    }
}
