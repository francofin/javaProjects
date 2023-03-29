package org.black;

import org.galaxy.Galaxy;
import org.planets.Planet;

public class GalaxyDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy galaxyOne = new Galaxy(41.268903, -169.315421, 2520000.0, 10.01, "Andromeda", 10000000, 25, 220000, "spiral");
		
//		Planet firstDiscovery = new Planet(1.20339629E28, );
		
		System.out.println(galaxyOne.toString());
		

	}

}
