package com.medical.hospboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medical.hospboot.model.Patient;
import com.medical.hospboot.service.PatientRepo;

@Component
public class PatientServiceImpl 
{

	@Autowired
	PatientRepo patientRepo;
	
	public List<Patient> getAllPatients()
	{
		return patientRepo.findAll(); // select * from patients
	}
	
	public Patient createPatient(Patient record)
	{
		return patientRepo.save(record);
	}
}
