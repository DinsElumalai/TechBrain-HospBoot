package com.medical.hospboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.hospboot.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long>
{
	

}
