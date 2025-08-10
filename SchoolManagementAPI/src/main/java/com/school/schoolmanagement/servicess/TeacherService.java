package com.school.schoolmanagement.servicess;

import java.util.List;

import com.school.schoolmanagement.entitys.Teacher;

public interface TeacherService {

	List<Teacher> getAll();

	List<Teacher> getByQualification(String q);

	List<Teacher> getByExperience(int min);

}
