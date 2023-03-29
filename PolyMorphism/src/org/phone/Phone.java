package org.phone;

public class Phone {
	private String brand;

	public Phone(String brand) {
		super();
		this.brand = brand;
	}
	
	
	public void features() {
		System.out.println("Phone is a feature phone and does not include smart features");
	}


	public String getBrand() {
		return brand;
	}
	
	
	
	
}
