package hw4.entities;

import hw4.abstracts.Entity;

public class Customer implements Entity{
	private int id;
	private String NationalityId;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String email;
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String nationalityId, String name, String surname, String dateOfBirth) {
		super();
		this.id = id;
		NationalityId = nationalityId;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
