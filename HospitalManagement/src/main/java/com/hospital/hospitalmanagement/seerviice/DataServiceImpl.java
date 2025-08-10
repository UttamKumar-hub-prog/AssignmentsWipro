package com.hospital.hospitalmanagement.seerviice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitalmanagement.DataRepository;
import com.hospital.hospitalmanagement.enntitiy.Patient;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataRepository dataRepository;

	@Override
	public List<Patient> allDetails() {
		 
		return dataRepository.findAll();
	}

	@Override
	public void savePatients(Patient patient) {
		 dataRepository.save(patient);
		
	}

	@Override
	public Patient getBySno(Long id) {
		 
		return dataRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		 dataRepository.deleteById(id);
		
	}
	
	 

}
