package com.example.demo.service;

import com.example.demo.dao.Dataprovider;
import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    public User findUserByIb(long id) {
        List<User> users = Dataprovider.users;

        return users.stream()
                .filter(user -> user.getId()==id)
                .findAny().get();
    }
}
