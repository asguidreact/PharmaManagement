package com.management.Pharma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.Pharma.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
	
}
