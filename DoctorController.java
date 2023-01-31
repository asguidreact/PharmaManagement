package com.management.Pharma.Control;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.Pharma.Service.DoctorService;
import com.management.Pharma.Model.Doctor;

@RestController
@CrossOrigin
public class DoctorController {
	
	
	@Autowired
	private DoctorService docservice;
	
	@PostMapping(path="/doctorsignup")
	public void doctorSignUp()
	{
		Doctor doctor = new Doctor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		doctor.setdName(name);
		System.out.println("Enter your specialization: ");
		String spl = sc.nextLine();
		doctor.setdSpecialization(spl);
		System.out.println("Enter your Email id: ");
		String email = sc.nextLine();
		doctor.setdEmail(email);
		System.out.println("Enter your password: ");
		String password = sc.nextLine();
		doctor.setPassword(password);
		docservice.createDoctor(doctor);
	}
	
}
           
    



 