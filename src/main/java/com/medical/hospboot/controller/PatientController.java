package com.medical.hospboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		return patientServiceImpl.getPatients();
	}
}
