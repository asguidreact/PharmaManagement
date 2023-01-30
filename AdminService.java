package com.management.Pharma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Pharma.Model.Admin;
import com.management.Pharma.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminrepos;
	
	public Admin createAdmin(Admin admin)
	{
		return adminrepos.save(admin);
	}

}
