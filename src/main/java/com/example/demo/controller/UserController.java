package com.example.demo.controller;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {


    //TODO GTB-知识点: - UserController.java:20 推荐是要用 构造函数注入
    @Autowired
    private UserService userService;

    //TODO GTB-知识点: - 如果多个方法的 path 有一样的前缀，可以提到 class level 去统一设置
    @GetMapping("/users/{id}")
    public User getUserInfo(@PathVariable long id) {

        //TODO GTB-工程实践: - UserController.java:26 这里直接 return 就好了，不用定义 result。
        User result = userService.findUserByIb(id);
        return result;
    }

    @PostMapping("users")
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
