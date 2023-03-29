package org.galaxy;

public class Galaxy {
	private double galaxyCoordinatesLat;
	private double galaxyCoordinatesLong;
	private double distanceFromMilkyWay;
	private double galaxyAge;
	private String galaxyName;
	private long numberOfPlanets;
	private int numberOfStars;
	private long galaxyDiameter;
	private String galaxytype;
	
	
	public Galaxy(double galaxyCoordinatesLat, double galaxyCoordinatesLong, double distanceFromMilkyWay, double galaxyAge,
			String galaxyName, long numberOfPlanets, int numberOfStars,
			long galaxyDiameter, String galaxytype) {
		
		this.galaxyCoordinatesLat = galaxyCoordinatesLat;
		this.galaxyCoordinatesLong = galaxyCoordinatesLong;
		this.distanceFromMilkyWay = distanceFromMilkyWay;
		this.galaxyAge = galaxyAge;
		this.galaxyName = galaxyName;
		this.numberOfPlanets = numberOfPlanets;
		this.numberOfStars = numberOfStars;
		this.galaxyDiameter = galaxyDiameter;
		this.galaxytype = galaxytype;
	}




	


	public double getGalaxyCoordinatesLat() {
		return galaxyCoordinatesLat;
	}



	public double getGalaxyCoordinatesLong() {
		return galaxyCoordinatesLong;
	}



	public double getDistanceFromMilkyWay() {
		return distanceFromMilkyWay;
	}


	public double getGalaxyAge() {
		return galaxyAge;
	}


	public String getGalaxyName() {
		return galaxyName;
	}


	public long getNumberOfPlanets() {
		return numberOfPlanets;
	}


	public String getGalaxytype() {
		return galaxytype;
	}



	public int getNumberOfStars() {
		return numberOfStars;
	}


	public long getGalaxyDiameter() {
		return galaxyDiameter;
	}







	@Override
	public String toString() {
		return "Galaxy [galaxyCoordinatesLat=" + galaxyCoordinatesLat + ", galaxyCoordinatesLong="
				+ galaxyCoordinatesLong + ", distanceFromMilkyWay=" + distanceFromMilkyWay + ", galaxyAge=" + galaxyAge
				+ ", galaxyName=" + galaxyName + ", numberOfPlanets=" + numberOfPlanets + ", numberOfStars="
				+ numberOfStars + ", galaxyDiameter=" + galaxyDiameter + ", galaxytype=" + galaxytype + "]";
	}
	
	
	
	

	
	
	
}
