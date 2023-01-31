package com.management.Pharma.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor_table")
public class Doctor {
	
	@Id
	@Column(name="doc_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int docId;
	private String dName;
	private String dSpecialization;
	private String dEmail;
	private String password;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdSpecialization() {
		return dSpecialization;
	}
	public void setdSpecialization(String dSpecialization) {
		this.dSpecialization = dSpecialization;
	}
	public String getdEmail() {
		return dEmail;
	}
	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
