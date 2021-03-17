package com.tugba.pojo;

public class Person {
	
	private int id;
	private String personName;
	private String personLastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String personName, String personLastName) {
		super();
		this.id = id;
		this.personName = personName;
		this.personLastName = personLastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", personLastName=" + personLastName + "]";
	}
	

}
