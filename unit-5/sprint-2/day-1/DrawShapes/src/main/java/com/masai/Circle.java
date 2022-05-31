package com.masai;

public class Circle implements Shapes{

	private String message;
	
	

	public Circle(String message) {
		super();
		this.message = message;
	}



	public void draw() {
		System.out.println(message+"You have drawn Circle.");
	}
}
