package com.management.Pharma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.Pharma.Model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
		
		
}
