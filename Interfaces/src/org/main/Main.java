package org.main;

import org.person.Person;
import org.person.Vegan;
import org.phone.OnePlusFive;
import org.phone.Phone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnePlusFive phone  = new OnePlusFive();
		String processor = phone.processor();
		System.out.println(processor);
		
		Phone phoneTwo = new OnePlusFive();
		System.out.println(phoneTwo.processor());
		
		
		Person john = new Vegan();
		john.eat();
		john.speak();
	}

}
