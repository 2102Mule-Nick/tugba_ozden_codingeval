package com.tugba.pojo;

public class Granparents extends Person{
	

	private String grandName;
	private String grandLastName;
	public Granparents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Granparents(int id, String personName, String personLastName) {
		super(id, personName, personLastName);
		// TODO Auto-generated constructor stub
	}
	public Granparents(String grandName, String grandLastName) {
		super();
		this.grandName = grandName;
		this.grandLastName = grandLastName;
	}
	public String getGrandName() {
		return grandName;
	}
	public void setGrandName(String grandName) {
		this.grandName = grandName;
	}
	public String getGrandLastName() {
		return grandLastName;
	}
	public void setGrandLastName(String grandLastName) {
		this.grandLastName = grandLastName;
	}
	@Override
	public String toString() {
		return "Granparents [grandName=" + grandName + ", grandLastName=" + grandLastName + "]";
	}

	
}
