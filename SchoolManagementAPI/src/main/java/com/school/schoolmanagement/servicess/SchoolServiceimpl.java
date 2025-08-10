package com.school.schoolmanagement.servicess;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolmanagement.entitys.School;
import com.school.schoolmanagement.repositorys.SchoolRepository;

@Service
public class SchoolServiceimpl implements SchoolService {

	@Autowired
	private SchoolRepository repo;

	public List<School> getAll() {
		return repo.findAll();
	}

	public School getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public School save(School s) {
		return repo.save(s);
	}
	
	public School saveAll(School s) {
		return repo.save(s);
		}

	public School update(Long id, School s) {
		s.setId(id);
		return repo.save(s);
	}

	public School patch(Long id, School updates) {
	    School school = repo.findById(id)
	        .orElseThrow(() -> new RuntimeException("School with id " + id + " not found"));

	    if (updates.getSchoolName() != null) {
	        school.setSchoolName(updates.getSchoolName());
	    }
	    if (updates.getSchoolAddress() != null) {
	        school.setSchoolAddress(updates.getSchoolAddress());
	    }
	    return repo.save(school);
	}


	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<School> findByName(String name) {
		return repo.findBySchoolNameNative(name);
	}

	 

	
}




























































//public List<School> findByTeacherCount(int count) {
//	return repo.findSchoolsWithTeacherCountNative(count);
//}
