package com.tugba.pojo;

public class Parents extends Person {
	
	private String momName;
	private String momLastName;
	private String dadName;
	private String dadLastName;
	public Parents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parents(int id, String personName, String personLastName) {
		super(id, personName, personLastName);
		// TODO Auto-generated constructor stub
	}
	public Parents(String momName, String momLastName, String dadName, String dadLastName) {
		super();
		this.momName = momName;
		this.momLastName = momLastName;
		this.dadName = dadName;
		this.dadLastName = dadLastName;
	}
	public String getMomName() {
		return momName;
	}
	public void setMomName(String momName) {
		this.momName = momName;
	}
	public String getMomLastName() {
		return momLastName;
	}
	public void setMomLastName(String momLastName) {
		this.momLastName = momLastName;
	}
	public String getDadName() {
		return dadName;
	}
	public void setDadName(String dadName) {
		this.dadName = dadName;
	}
	public String getDadLastName() {
		return dadLastName;
	}
	public void setDadLastName(String dadLastName) {
		this.dadLastName = dadLastName;
	}
	@Override
	public String toString() {
		return "Parents [momName=" + momName + ", momLastName=" + momLastName + ", dadName=" + dadName
				+ ", dadLastName=" + dadLastName + "]";
	}
	
	

}
