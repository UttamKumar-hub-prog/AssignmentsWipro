package com.school.schoolmanagement.servicess;

import java.util.List;

import com.school.schoolmanagement.entitys.School;

public interface SchoolService {

	List<School> getAll();

	School getById(Long id);

	School save(School s);

	School update(Long id, School s);

	School patch(Long id, School updates);

	void delete(Long id);

	List<School> findByName(String name);

	

	School saveAll(School s);

}




































//List<School> findByTeacherCount(int count);