package com.masai;

public class Cylinder implements Shapes{

	private String message;
	
	
	
	public Cylinder(String message) {
		super();
		this.message = message;
	}



	public void draw() {
		System.out.println(message+"You have drawn Cylinder.");
	}

}
