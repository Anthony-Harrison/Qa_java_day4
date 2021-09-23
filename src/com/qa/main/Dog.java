package com.qa.main;

public class Dog extends Animal{
	private int wagSpeed;

	public Dog() {
		super();
		
	}

	public Dog(String name, int age, String furColour, float weight, int wagS) {
		super(name, age, furColour, weight);
		this.wagSpeed = wagS;
	}

	public int getWagSpeed() {
		return wagSpeed;
	}

	public void setWagSpeed(int wagSpeed) {
		this.wagSpeed = wagSpeed;
	}

	@Override
	public String toString() {
		return "Dog [wagSpeed=" + wagSpeed + ", toString()=" + super.toString() + "]";
	}
	
}
