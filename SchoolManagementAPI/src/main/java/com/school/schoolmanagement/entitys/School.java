package com.school.schoolmanagement.entitys;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_info")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String schoolName;
	private String schoolAddress;

	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	private List<Teacher> teachers;
}
