package com.test.entity;

public class Employe {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Employe(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employe() {
	}
	
}
