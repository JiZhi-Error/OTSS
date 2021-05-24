package com.example.otss.controller;

import com.example.otss.entity.Users;
import com.example.otss.service.UserService;
import com.fasterxml.jackson.annotation.JsonView;
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
    @JsonView(Users.UsersInfo.class)
    public List<Users> getAll() {
        return userService.findAll();
    }

    @PostMapping(value = "createUser")
    public String createUser(@RequestBody Users user) {
        userService.createUser(user);
        return "success";
    }

    @GetMapping(value = "findUserById/{id}")
    @JsonView(Users.UsersInfo.class)
    public Users findUserById(@PathVariable Integer id) {
        return userService.findUserById(id);

    }

    @DeleteMapping(value = "deleteUserById/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }


}
