package com.school.schoolmanagement.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.schoolmanagement.entitys.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

	@Query(value = "SELECT * FROM student_info WHERE school_name LIKE CONCAT('%', :name, '%')", nativeQuery = true)
	List<School> findBySchoolNameNative(@Param("name") String name);

 

}
