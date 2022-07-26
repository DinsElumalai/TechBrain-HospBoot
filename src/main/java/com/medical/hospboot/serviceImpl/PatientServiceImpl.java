package com.medical.hospboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medical.hospboot.model.Patient;
import com.medical.hospboot.service.PatientRepository;

@Component
public class PatientServiceImpl
{

	@Autowired
	PatientRepository patientRepo;
	
	public List<Patient> getAllPatients()
	{
		return patientRepo.findAll();
	}
	
	public Patient insertPatient(Patient record)
	{
		return patientRepo.save(record);
	}
	
	public Patient upatePatient(Patient record)
	{
		return patientRepo.save(record);
	}
	
	public void deletePatient(long ptId)
	{
		patientRepo.deleteById(ptId);
	}
	
}
