package com.school.schoolmanagement.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolmanagement.entitys.Teacher;
import com.school.schoolmanagement.servicess.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/getAllTeachers")
	public List<Teacher> getAll() {
		return teacherService.getAll();
	}

	@GetMapping("/qualification/{q}")
	public List<Teacher> byQualification(@PathVariable String q) {
		return teacherService.getByQualification(q);
	}

	@GetMapping("/experience/{min}")
	public List<Teacher> byExperience(@PathVariable int min) {
		return teacherService.getByExperience(min);
	}
}
