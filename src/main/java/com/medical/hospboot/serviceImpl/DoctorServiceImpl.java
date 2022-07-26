package com.medical.hospboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medical.hospboot.model.Doctor;
import com.medical.hospboot.service.DoctorRepository;

@Component
public class DoctorServiceImpl {
	
	@Autowired
	DoctorRepository doctorRepo;
	
	public List<Doctor> getAllDoctors()
	{
		return doctorRepo.findAll();
	}
	
	public Doctor insertDoctor(Doctor record)
	{
		return doctorRepo.save(record);
	}
	
	public Doctor upateDoctor(Doctor record)
	{
		return doctorRepo.save(record);
	}
	
	public void deleteDoctor(long dtId)
	{
		doctorRepo.deleteById(dtId);
	}

}
