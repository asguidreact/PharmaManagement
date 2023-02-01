package com.management.Pharma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Pharma.Model.DrugInventory;
import com.management.Pharma.Repository.DrugInventoryRepository;

import jakarta.transaction.Transactional;

@Service
public class DrugInventoryService {

	@Autowired
	private DrugInventoryRepository drugrepository;
	
	public DrugInventory addDrug(DrugInventory drIvr)
	{
		return drugrepository.save(drIvr);	
	}
	
	public List<DrugInventory> viewAllDrugs()
	{
		return drugrepository.findAll();
	}
	
	@Transactional
	public boolean updateDrug(DrugInventory dr) {
		
		drugrepository.updateDrug(dr.getManufacturerName(),dr.getDrugName(),
				dr.getDrugId());
		//srepos.updateShow(show.getGenre(), show.getShowName(), 
			//	show.getDuration(),show.getShowid());
		return true;
	}
	
	public void deleteDrugById(int drugId)
	{
		drugrepository.deleteById(drugId);
	}
}
