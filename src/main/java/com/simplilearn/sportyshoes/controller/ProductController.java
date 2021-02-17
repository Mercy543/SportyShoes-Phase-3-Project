package com.simplilearn.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.entity.Product;
import com.simplilearn.sportyshoes.repository.ProductRepository;



@RestController
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	//get all products
		@GetMapping("/products")
		public List<Product> getAllProducts(){
			return this.productRepository.findAll();
		}
		
		public List<Product> findBycategory(String category){
			return productRepository.findProductBycategory(category);
		}
		
		//get product by category
		@GetMapping("/products/{category}")
		public List<Product> getProductByCategory(@PathVariable String category) {
			return findBycategory(category);
					
		}
	
}
