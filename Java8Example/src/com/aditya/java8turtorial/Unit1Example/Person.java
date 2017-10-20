package com.aditya.java8turtorial.Unit1Example;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer id;
	
	public Person(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Person [FIRST NAME : " +firstName + ", LAST NAME : " +lastName + ", ID : " +id + "]";
	}

}
