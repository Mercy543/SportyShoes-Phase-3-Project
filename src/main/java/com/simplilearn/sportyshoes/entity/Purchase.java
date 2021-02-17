package com.simplilearn.sportyshoes.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Purchase {
	
	@Id
	@GeneratedValue
	private int id;
	private int userid;
	private String description;
	private String category;
	private int quantity;
	private LocalDateTime date;
	
	
	public Purchase() {}
	
	public Purchase(int id, int userid, String description, String category, int quantity, LocalDateTime date) {
		this.id = id;
		this.userid = userid;
		this.description = description;
		this.category = category;
		this.quantity = quantity;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", userid=" + userid + ", description=" + description + ", category=" + category
				+ ", quantity=" + quantity + ", date=" + date + "]";
	}
	
	

}
