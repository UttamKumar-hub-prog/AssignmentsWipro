package com.school.schoolmanagement.controlller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolmanagement.entitys.School;
import com.school.schoolmanagement.servicess.SchoolService;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService  schoolService;
    @PostMapping("/saveSchoolDetails")
    public School saveSchoolDetails(@RequestBody School s) {
        return schoolService.save(s);
    }
    
    @GetMapping("/getAllInfo")
    public List<School> getAll() {
        return schoolService.getAll();
    }

    @GetMapping("/getById/{id}")
    public School getById(@PathVariable Long id) {
        return schoolService.getById(id);
    }

   
    @GetMapping("/saveAll")
    public School saveAllDetails(@RequestBody School s) {
    	return schoolService.saveAll(s);
    }

    @PutMapping("/updateSchoolById/{id}")
    public School updateSchoolById(@PathVariable Long id, @RequestBody School s) {
        return schoolService.update(id, s);
    }

    @PatchMapping("/patchUpdateSchoolById/{id}")
    public School patchUpdateSchoolById(@PathVariable Long id, @RequestBody School updates) {
        return schoolService.patch(id, updates);
    }

    @DeleteMapping("/deleteSchoolById/{id}")
    public String deleteSchool(@PathVariable Long id) {
    	schoolService.delete(id);
    	return "Schools details is deleted";
    }

    @GetMapping("/getByName/{schoolName}")
    public List<School> getByName(@PathVariable String schoolName) {
        return schoolService.findByName(schoolName);
    }

    
}

































 
//@GetMapping("/teacherCount/{count}")
//public List<School> byTeacherCount(@PathVariable int count) {
//    return schoolService.findByTeacherCount(count);
//}