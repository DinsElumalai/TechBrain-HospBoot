package com.medical.hospboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String ptName;
	@Column
	private String mobileNo;
	
	public Patient() {}
	public Patient(String ptName, String mobileNo) {
		super();
		this.ptName = ptName;
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", ptName=" + ptName + ", mobileNo=" + mobileNo + "]";/*, treatingDoctors="
				+ treatingDoctors + "]";*/
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/*public List<Doctor> getTreatingDoctors() {
		return treatingDoctors;
	}
	public void setTreatingDoctors(List<Doctor> treatingDoctors) {
		this.treatingDoctors = treatingDoctors;
	}*/
	
	
}
