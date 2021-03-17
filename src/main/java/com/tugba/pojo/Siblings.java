package com.tugba.pojo;

public class Siblings extends Person {
	
	private String siblingName;
	private String siblingLastName;
	public Siblings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Siblings(int id, String personName, String personLastName) {
		super(id, personName, personLastName);
		// TODO Auto-generated constructor stub
	}
	public Siblings(String siblingName, String siblingLastName) {
		super();
		this.siblingName = siblingName;
		this.siblingLastName = siblingLastName;
	}
	public String getSiblingName() {
		return siblingName;
	}
	public void setSiblingName(String siblingName) {
		this.siblingName = siblingName;
	}
	public String getSiblingLastName() {
		return siblingLastName;
	}
	public void setSiblingLastName(String siblingLastName) {
		this.siblingLastName = siblingLastName;
	}
	@Override
	public String toString() {
		return "Siblings [siblingName=" + siblingName + ", siblingLastName=" + siblingLastName + "]";
	}
	
	
	

}
