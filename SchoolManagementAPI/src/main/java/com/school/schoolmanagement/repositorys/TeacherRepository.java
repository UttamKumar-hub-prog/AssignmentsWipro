package com.school.schoolmanagement.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.schoolmanagement.entitys.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	@Query(value = "SELECT * FROM teacher_info WHERE qualification = :qualification", nativeQuery = true)
	List<Teacher> findByQualificationNative(@Param("qualification") String qualification);

	List<Teacher> findByExperienceGreaterThan(int experience);
}
