package com.hospital.hospitalmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospitalmanagement.enntitiy.Patient;

@Repository
public interface DataRepository extends JpaRepository<Patient, Long> {

}
