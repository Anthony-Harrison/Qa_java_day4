package com.qa.main;

public abstract class Animal implements Eats, Drink{
	private String name;
	private int age;
	private String furColour;
	private float weight;
	
	public Animal() {
		super();
	}

	public Animal(String name, int age, String furColour, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.furColour = furColour;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFurColour() {
		return furColour;
	}

	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", furColour=" + furColour + ", weight=" + weight + "]";
	}

	@Override
	public void drink() {
		System.out.println("Liquid");
	
	}

	@Override
	public void eats() {
		System.out.println("Food");
		
	}

}
