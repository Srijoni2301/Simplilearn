package com.simplilearn;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing sth");
	}
	
	public void writeColor() {
		System.out.println(this.color);   // this is a keyword which tells which object is calling the function
	}
	
	public void writeType() {
		System.out.println(this.type);
	}
	
	//non parameterized constructor, not necessary to write
	
	Pen(){ 
		System.out.println("non paramerized constructor called");
		}
	
	//parameterized constructor
	Pen(String color, String type){
		this.color = color;
		this.type = type;
	}	

}

public class Various_constructor {

	public static void main(String[] args) {
		Pen sainosoftek = new Pen();
		
		sainosoftek.color = "blue";
		sainosoftek.type = "gel";
		
		sainosoftek.write(); 
		sainosoftek.writeColor();
		sainosoftek.writeType();
		
	}

}
