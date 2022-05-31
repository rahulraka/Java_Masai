package com.masai;

public class Triangle implements Shapes{
	
	private String message;
	
	
	

	public Triangle(String message) {
		super();
		this.message = message;
	}




	public void draw() {
		System.out.println(message+"You have drawn Triangle.");
	}

}
