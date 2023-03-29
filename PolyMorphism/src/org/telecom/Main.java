package org.telecom;

import org.phone.Phone;
import org.phone.SamsungNote8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone newPhone = new Phone("Samsung x5");
		
		SamsungNote8 noteEight = new SamsungNote8("Note 8");
		
		System.out.println(newPhone.getBrand());
		System.out.println(noteEight.getBrand());
		
		Phone olderGen = new SamsungNote8("Note 7");
		
		System.out.println(olderGen.getBrand());
	}

}
