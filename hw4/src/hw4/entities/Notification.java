package hw4.entities;

import hw4.abstracts.Entity;

public class Notification implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private String message;
	
	public Notification() {
		
	}
	
	public Notification(int id, int categoryId, String name, String message) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.message = message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
