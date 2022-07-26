package com.medical.hospboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.hospboot.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>
{

}
