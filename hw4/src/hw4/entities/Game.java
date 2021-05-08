package hw4.entities;

import hw4.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private double price;
	private String description;
	
	public Game() {
		
	}
	
	public Game(int id, int categoryId, String name, String description,double price) {
		this.price = price;
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
