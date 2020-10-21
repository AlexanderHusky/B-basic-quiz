package com.example.demo.service;

import com.example.demo.dao.Dataprovider;
import com.example.demo.model.Education;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationService {

    public List<Education> getUserEducationList(long id) {
        List<Education> educations = Dataprovider.educationList;
        return educations.stream().filter(education -> education.getUserId() == id).collect(Collectors.toList());

    }
}
