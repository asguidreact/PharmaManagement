package com.management.Pharma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.management.Pharma.Model.DrugInventory;

@Repository
public interface DrugInventoryRepository extends JpaRepository<DrugInventory,Integer> {
	
	@Modifying
	@Query(value="update drugs_table set manufacturername=?1, drugname=?2 where "
			+ "drug_id=?3 ",nativeQuery=true)
	public void updateDrug(@Param("manufacturername")String manufacurerName,
			@Param("drugname")String drugName,
			@Param("drug_id")int drugId);
	
	
		
	
}
