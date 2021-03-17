package com.tugba.pojo;

public class Children extends Person{
	
	private String childName;
	private String childLastName;
	private Person person;
	public Children() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Children(String childName, String childLastName, Person person) {
		super();
		this.childName = childName;
		this.childLastName = childLastName;
		this.person = person;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildLastName() {
		return childLastName;
	}
	public void setChildLastName(String childLastName) {
		this.childLastName = childLastName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Children [childName=" + childName + ", childLastName=" + childLastName + ", person=" + person + "]";
	}
	
	

}
