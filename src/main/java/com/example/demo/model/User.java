package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class User {

    public long id;
    public String name;

    public long age;
    public String avatar;
    public String description;


    public User() {}

    public User(long id, String name, long age, String avatar, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}