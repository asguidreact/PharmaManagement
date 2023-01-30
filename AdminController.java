package com.management.Pharma.Control;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.management.Pharma.Exception.AdminAlreadyExists;
import com.management.Pharma.Model.Admin;
import com.management.Pharma.Service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	
	
	@Autowired
	private AdminService adminservice;
	
	public void AdminSignUp() throws AdminAlreadyExists
	{
		Admin admin = new Admin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the admin: ");
		String name = sc.nextLine();
		admin.setAdminName(name);
		System.out.println("Enter password for account: ");
		String password = sc.nextLine();
		admin.setPassword(password);
		System.out.println("Enter email id: ");
		String email = sc.nextLine();
		admin.setEmpEmail(email);
		System.out.println("Enter designation: ");
		String desg = sc.nextLine();
		admin.setDesignation(desg);
		adminservice.createAdmin(admin);
	}
	
	
}
