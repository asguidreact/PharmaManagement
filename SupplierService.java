package com.management.Pharma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Pharma.Model.Supplier;
import com.management.Pharma.Repository.SupplierRepository;

@Service
public class SupplierService {
		
	@Autowired
	private SupplierRepository supprepos;
	
	public Supplier AddSupplier(Supplier sup)
	{
		return supprepos.save(sup);
	}
	
	public List<Supplier> viewAllSupplier()
	{
		return supprepos.findAll();
	}
	
	public void deleteSupplierById(int id)
	{
		supprepos.deleteById(id);
	}
}
