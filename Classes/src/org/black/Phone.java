package org.black;

public class Phone {
	
	private String model;
	private int year;
	private String softWareVersion;
	private String owner;
	
	public Phone(String model, int year, String softWareVersion) {
		
		this.model = model;
		this.year = year;
		this.softWareVersion = softWareVersion;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSoftWareversion() {
		return softWareVersion;
	}
	public void setSoftWareversion(String softWareversion) {
		this.softWareVersion = softWareversion;
	}
	
	public String showOwner() {
		return owner+" now owns this "+model+" device";
	}
	
	
	public void buyPhone(String name) {
		this.owner = name;
	}
	
	
	
	
	

}
