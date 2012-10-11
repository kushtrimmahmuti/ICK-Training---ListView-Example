package com.milot.example.list;

public class Person {
	String name;
	String lastname;
	String description;
	
	public Person(){}
	
	public Person(String name, String lastname, String description) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
