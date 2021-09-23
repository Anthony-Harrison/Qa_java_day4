package com.qa.main;

public class Horse extends Animal{
	private String uniqueToHorse;

	public Horse() {
		super();
		
	}

	public Horse(String name, int age, String furColour, float weight, String unique) {
		super(name, age, furColour, weight);
		this.uniqueToHorse = unique;
	}

	public String getUniqueToHorse() {
		return uniqueToHorse;
	}

	public void setUniqueToHorse(String uniqueToHorse) {
		this.uniqueToHorse = uniqueToHorse;
	}

	@Override
	public String toString() {
		return "Horse [uniqueToHorse=" + uniqueToHorse + ", toString()=" + super.toString() + "]";
	}

	
	


}
