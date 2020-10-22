package com.example.demo.controller;

import com.example.demo.model.Education;
import com.example.demo.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping("/users/{id}/educations")
    public List<Education> getUserEducationList(@PathVariable long id) {
        return educationService.getUserEducationList(id);
    }

    //TODO GTB-知识点: - 如果多个方法的 path 一样，可以提到 class level 去统一设置
    @PostMapping("/users/{id}/educations")
    public ResponseEntity addEducation(@RequestBody Education education, long id) {
        //TODO GTB-知识点: - 可以简化为 @ResponseStatus
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
