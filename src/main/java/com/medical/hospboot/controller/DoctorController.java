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

import com.medical.hospboot.model.Doctor;
import com.medical.hospboot.serviceImpl.DoctorServiceImpl;

@RestController
@RequestMapping("api/v1/hosp")
public class DoctorController {

	@Autowired
	DoctorServiceImpl doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors()
	{
		return doctorService.getAllDoctors();
	}
	
	@PostMapping("/doctors")
	public Doctor insertDoctor(@RequestBody Doctor record)
	{
		return doctorService.insertDoctor(record);
	}

	@PutMapping("/doctors")
	public Doctor upateDoctor(@RequestBody Doctor record)
	{
		return doctorService.upateDoctor(record);
	}
	
	@DeleteMapping("/doctors/{dtId}")
	public void deleteDoctor(@PathVariable long dtId)
	{
		doctorService.deleteDoctor(dtId);
	}
}
