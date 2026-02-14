package com.impact.lesson20.controller;

import com.impact.lesson20.model.User;
import com.impact.lesson20.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService =  new UserService();


    @PostMapping("/users/create")
    public User CreateUser(@RequestBody User user){
        return userService.CreateUser(user);
    }

    @GetMapping("users/get_all")
    public List<User> GetAllUsers(){
        return userService.GetAllUser();
    }
}
