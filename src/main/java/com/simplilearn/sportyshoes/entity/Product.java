package com.simplilearn.sportyshoes.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity(name="product")
public class Product {
	
	
	@Id
	@GeneratedValue
	private int pid;
	
	private String description;
	
    
	private float price;

	private String category;
	
	public Product() {}
	
    

	Product(int pid, String description, float price, String category) {
		this.pid = pid;
		this.description = description;
		this.price = price;
		this.category = category;
	}



	public int getPId() {
		return pid;
	}
     

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
   public String getCategory() {
		return category;
	}
   

	
   
   
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	

}
