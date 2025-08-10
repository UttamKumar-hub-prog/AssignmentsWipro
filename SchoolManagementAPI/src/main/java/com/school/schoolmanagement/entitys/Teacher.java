package com.school.schoolmanagement.entitys;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="teacher_info")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String teacherName;
	private String teacherAddress;

	@Enumerated(EnumType.STRING)
	private Qualification qualification;

	private int age;
	private LocalDate dob;
	private int experience;

	 
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	public enum Qualification {
		BSC, MSC, BEd, MEd, PHD
	}
}
