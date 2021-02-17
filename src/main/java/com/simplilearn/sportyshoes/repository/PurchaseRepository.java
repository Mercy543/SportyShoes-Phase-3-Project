package com.simplilearn.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.sportyshoes.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer>{
	
	
	public List<Purchase> findPurchaseByCategory(String category);

}
