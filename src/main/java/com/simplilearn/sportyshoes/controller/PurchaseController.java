package com.simplilearn.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.entity.Purchase;
import com.simplilearn.sportyshoes.repository.PurchaseRepository;

@RestController
@RequestMapping
public class PurchaseController {
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	
	//get all purchase
			@GetMapping("/viewpurchase")
			public List<Purchase> getAllPurchase(){
				return this.purchaseRepository.findAll();
			}
			
			public List<Purchase> findPurchaseBycategory(String category){
				return purchaseRepository.findPurchaseByCategory(category);
			}
			
			//get purchase by category
			@GetMapping("/purchase/{category}")
			public List<Purchase> getPurchaseByCategory(@PathVariable String category) {
				return findPurchaseBycategory(category);
						
			}
		
	
			//Make a purchase
			@PostMapping("/addpurchase")
			public Purchase addPurchase(@RequestBody Purchase purchase) {
				return this.purchaseRepository.save(purchase);
			}
}
