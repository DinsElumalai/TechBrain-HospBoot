package com.medical.hospboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.hospboot.model.Patient;
import com.medical.hospboot.serviceImpl.PatientServiceImpl;

@RestController
@RequestMapping("/api/v1/medical")
public class PatientController 
{

	@Autowired
	PatientServiceImpl patientServiceImpl;
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients()
	{
		return patientServiceImpl.getAllPatients();
	}
	
	@PostMapping("/patients")
	public Patient createPatient(@RequestBody Patient record)
	{
		return patientServiceImpl.createPatient(record);
	}
}
