package com.school.schoolmanagement.servicess;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolmanagement.entitys.Teacher;
import com.school.schoolmanagement.repositorys.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository repo;

    public List<Teacher> getAll() {
        return repo.findAll();
    }

    public List<Teacher> getByQualification(String qualification) {
        return repo.findByQualificationNative(qualification);
    }

    public List<Teacher> getByExperience(int years) {
        return repo.findByExperienceGreaterThan(years);
    }
}

