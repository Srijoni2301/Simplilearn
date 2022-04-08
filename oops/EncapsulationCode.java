package com.simplilearn.oops;

class Dog{
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param name
	 * @param color
	 * @param age
	 * @param cost
	 * @param breed
	 */
	
	
	
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//constructor
	public Dog(String name, String color, int age, int cost, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.cost = cost;
		this.breed = breed;
	}
	
	@Override
	public String toString() {    //Returns a string representation of the object
		return getName()+"--"+getColor()+"--"+getAge()+"--"+getCost()+"--"+getBreed();
	}
}

public class EncapsulationCode {

	public static void main(String[] args) {
		Dog d = new Dog("tommy", "brown",5,5000,"GR");
		System.out.println(d.toString());
		
		d.setAge(7);
		d.setName("jerry");
		System.out.println(d.toString());
		
		System.out.println("cost is:"+d.getCost());
	}

}
