package com.example.demo.controller;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUserInfo(@PathVariable long id) {

        User result = userService.findUserByIb(id);
        return result;
    };
}
