package com.management.Pharma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Pharma.Model.Doctor;
import com.management.Pharma.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository docrepository;
	
	public Doctor createDoctor(Doctor doctor)
	{
		return docrepository.save(doctor);
	}
}
