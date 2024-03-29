package com.medical.hospboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.hospboot.model.Patient;
import com.medical.hospboot.serviceImpl.PatientServiceImpl;

@RestController
@RequestMapping("api/v1/hosp")
public class PatientController 
{
	
	@Autowired
	PatientServiceImpl patientService;
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients()
	{
		return patientService.getAllPatients();
	}
	
	@PostMapping("/patients")
	public Patient insertPatient(@RequestBody Patient record)
	{
		return patientService.insertPatient(record);
	}

	@PutMapping("/patients")
	public Patient upatePatient(@RequestBody Patient record)
	{
		return patientService.upatePatient(record);
	}
	
	@DeleteMapping("/patients/{ptId}")
	public void deletePatient(@PathVariable long ptId)
	{
		patientService.deletePatient(ptId);
	}
}
