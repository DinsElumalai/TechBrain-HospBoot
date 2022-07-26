package com.medical.hospboot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "doctors")
public class Doctor implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String dtName;
	@Column
	private String dptId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "pt_id")
	@JsonIgnore
	private Patient patient;
	
	public Doctor() {}

	public Doctor(String dtName, String dptId) {
		super();
		this.dtName = dtName;
		this.dptId = dptId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDtName() {
		return dtName;
	}

	public void setDtName(String dtName) {
		this.dtName = dtName;
	}

	public String getDptId() {
		return dptId;
	}

	public void setDptId(String dptId) {
		this.dptId = dptId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	
	
}
