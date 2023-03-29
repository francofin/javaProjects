package org.main;

import org.cpu.Laptop;
import org.parts.GraphicsCard;
import org.parts.Processor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop myLaptop = new Laptop();
		GraphicsCard laptopGC = new GraphicsCard();
		
		Processor myProcessor = new Processor();
		
//		System.out.println(myProcessor.getBrand());
		
		Processor laptopProcessor = myLaptop.getProcessor();
		
//		System.out.println(laptopProcessor.getBrand());
		
		Laptop gamingLaptop = new Laptop(17f,myProcessor, "DDR4",  "4TB", laptopGC, null, "backlit");
		
		System.out.println(gamingLaptop.toString());
		System.out.println(gamingLaptop.gamingMode());
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}

}
