package org.black;

public class SalePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phoneOne = new Phone("Apple", 2022, "OSX 15");

		phoneOne.buyPhone("John");
		
		System.out.println(phoneOne.showOwner());
		
	}

}
