package org.parts;

public class Processor {
	private String brand;
	private String series;
	private int genration;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	
	public Processor() {
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.genration = 7;
		this.cores = 4;
		this.threads = 6;
		this.cacheMemory = "3MB";
		this.frequency = "2.5GHz";
		this.minFrequency = "2.5GHz";
		this.maxFrequency = "3.5GHz";
	}


	public Processor(String brand, String series, int genration, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		
		this.brand = brand;
		this.series = series;
		this.genration = genration;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}


	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", genration=" + genration + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}


	public String getBrand() {
		return brand;
	}


	public String getSeries() {
		return series;
	}


	public int getGenration() {
		return genration;
	}


	public int getCores() {
		return cores;
	}


	public int getThreads() {
		return threads;
	}


	public String getCacheMemory() {
		return cacheMemory;
	}


	public String getFrequency() {
		return frequency;
	}


	public String getMinFrequency() {
		return minFrequency;
	}


	public String getMaxFrequency() {
		return maxFrequency;
	}


	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	
	
}

