package com.example.demo.model;

//TODO GTB-工程实践: - Education.java:3 未删除的无用代码
import lombok.Data;


public class Education {
    private long userId;
    private long year;
    private String title;
    private String description;

    public Education() {}

    public Education(long userId, long year, String title, String description) {
        this.userId = userId;
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
