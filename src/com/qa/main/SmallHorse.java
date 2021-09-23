package com.qa.main;



public class SmallHorse extends Horse implements CarePackage{
	private boolean carryChild;

	public SmallHorse() {
		super();
		
	}


	public SmallHorse(String name, int age, String furColour, float weight, String unique, boolean carryChild) {
		super(name, age, furColour, weight, unique);
		this.carryChild = carryChild;
	}

	public boolean isCarryChild() {
		return carryChild;
	}

	public void setCarryChild(boolean carryChild) {
		this.carryChild = carryChild;
	}

	@Override
	public void carePackage() {
		System.out.println("Special bath for you");
		
	}



}
