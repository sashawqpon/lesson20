package com.impact.lesson20.service;
import com.impact.lesson20.model.User;
import com.impact.lesson20.store.UserStore;

import java.util.List;

public class UserService {

    private final UserStore store = new UserStore();

    public User CreateUser(User user){
        User newUser = new User(user.getUsername(), user.getEmail(), user.getPassword(), user.getRole());

    return store.save(newUser);
}

public List<User> GetAllUser(){
        return store.findAll();
}

}
