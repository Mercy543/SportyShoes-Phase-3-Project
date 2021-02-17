package com.simplilearn.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.sportyshoes.entity.Product;



public interface ProductRepository extends JpaRepository<Product ,Integer>{
	
	
	
	public List<Product> findProductBycategory(String category);
	
	
	
	

}
