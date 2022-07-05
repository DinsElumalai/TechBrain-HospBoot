package com.medical.hospboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="patients")
@EntityListeners(AuditingEntityListener.class)
public class Patient 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long ptId;
	@Column
	private String ptName;
	@Column
	private String ptAge;
	@Column
	private String ptAddress;
	@Column
	private String ptAdmittedDpt;
	
	public Patient()
	{
		
	}

	public Patient(long ptId, String ptName, String ptAge, String ptAddress, String ptAdmittedDpt) {
		super();
		this.ptId = ptId;
		this.ptName = ptName;
		this.ptAge = ptAge;
		this.ptAddress = ptAddress;
		this.ptAdmittedDpt = ptAdmittedDpt;
	}

	@Override
	public String toString() {
		return "Patient [ptId=" + ptId + ", ptName=" + ptName + ", ptAge=" + ptAge + ", ptAddress=" + ptAddress
				+ ", ptAdmittedDpt=" + ptAdmittedDpt + "]";
	}

	public long getPtId() {
		return ptId;
	}

	public void setPtId(long ptId) {
		this.ptId = ptId;
	}

	public String getPtName() {
		return ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public String getPtAge() {
		return ptAge;
	}

	public void setPtAge(String ptAge) {
		this.ptAge = ptAge;
	}

	public String getPtAddress() {
		return ptAddress;
	}

	public void setPtAddress(String ptAddress) {
		this.ptAddress = ptAddress;
	}

	public String getPtAdmittedDpt() {
		return ptAdmittedDpt;
	}

	public void setPtAdmittedDpt(String ptAdmittedDpt) {
		this.ptAdmittedDpt = ptAdmittedDpt;
	}
	
	
	
}
