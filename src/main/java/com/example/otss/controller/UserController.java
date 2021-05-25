package com.example.otss.controller;

import com.example.otss.entity.Age;
import com.example.otss.entity.User;
import com.example.otss.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "getAll")
    public List<User> getAll() {
        return userService.findAll();
    }

    @PostMapping(value = "createUser")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "success";
    }

    @GetMapping(value = "findUserById/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userService.findUserById(id);

    }

    @DeleteMapping(value = "deleteUserById/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }


    @GetMapping(value = "getAllAgePie")
    public List<Age> getUsersAllAgePie(){
        return userService.getUsersAllAgePie();
    }
    @GetMapping(value = "getAllAgeLine")
    public List<Integer> getUsersAllAgeLine(){
        return userService.getUsersAllAgeLine();
    }


}
