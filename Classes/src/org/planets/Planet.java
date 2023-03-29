package org.planets;

import org.galaxy.Galaxy;

public class Planet extends Galaxy{

	private double planetSize;
	private long planetDistanceFromEarth;
	private int lengthOfDay;
	private String planetName;
	private int lengthOfYear;
	private int planetAge;
	private boolean isHabitable;
	private double gravitationalForce;
	private double planetDiameter;
	private double surfaceTemperature;
	private Galaxy galaxy;
	private int dateFound;
	
	
	



	public Planet( double planetSize,long planetDistanceFromEarth, int lengthOfDay, String planetName, int lengthOfYear, int planetAge,
			boolean isHabitable, double gravitationalForce, double planetDiameter, double surfaceTemperature, Galaxy galaxy, int dateFound) {
		super(galaxy.getGalaxyCoordinatesLat(),  galaxy.getGalaxyCoordinatesLong(), galaxy.getDistanceFromMilkyWay(), 
				galaxy.getGalaxyAge(), galaxy.getGalaxyName(), galaxy.getNumberOfPlanets(),
				galaxy.getNumberOfStars(), galaxy.getGalaxyDiameter(), galaxy.getGalaxytype());

		this.planetSize = planetSize;
		this.planetDistanceFromEarth = planetDistanceFromEarth;
		this.lengthOfDay = lengthOfDay;
		this.planetName = planetName;
		this.lengthOfYear = lengthOfYear;
		this.planetAge = planetAge;
		this.isHabitable = isHabitable;
		this.gravitationalForce = gravitationalForce;
		this.planetDiameter = planetDiameter;
		this.surfaceTemperature = surfaceTemperature;
		this.dateFound = dateFound;
	}

	public int getDateFound() {
		return dateFound;
	}



//	public String getPlanetLocation() {
//		return planetLocation;
//	}
//
//
//
//	public String getPlanetCoordinates() {
//		return planetCoordinates;
//	}



	public double getPlanetSize() {
		return planetSize;
	}



	public long getPlanetDistanceFromEarth() {
		return planetDistanceFromEarth;
	}



	public int getLengthOfDay() {
		return lengthOfDay;
	}



	public String getPlanetName() {
		return planetName;
	}



	public int getLengthOfYear() {
		return lengthOfYear;
	}



	public int getPlanetAge() {
		return planetAge;
	}



	public boolean isHabitable() {
		return isHabitable;
	}



	public double getGravitationalForce() {
		return gravitationalForce;
	}



	public double getPlanetDiameter() {
		return planetDiameter;
	}



	public double getSurfaceTemperature() {
		return surfaceTemperature;
	}
	
	
	
	
	
}
