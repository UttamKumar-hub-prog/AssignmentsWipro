package com.hospital.hospitalmanagement.seerviice;

import java.util.List;

import com.hospital.hospitalmanagement.enntitiy.Patient;

public interface DataService {

	public List<Patient> allDetails(); 
	public void savePatients(   Patient patient);
	public Patient getBySno(Long id);

	public void delete(Long id);
}
