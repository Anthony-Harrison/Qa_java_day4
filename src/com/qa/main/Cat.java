package com.qa.main;

public class Cat extends Animal{
	private int whiskers;

	public Cat() {
		super();
		
	}

	public Cat(String name, int age, String furColour, float weight, int whiskers) {
		super(name, age, furColour, weight);
		this.whiskers = whiskers;
	}

	public int getWhiskers() {
		return whiskers;
	}

	public void setWhiskers(int whiskers) {
		this.whiskers = whiskers;
	}

	@Override
	public String toString() {
		return "Cat [whiskers=" + whiskers + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void eats() {
		System.out.println("Never eat");
	}
	
	

}
