package com.day4;

public class Demo {
	
	Demo(){
		this("Hi");
		System.out.println("Inside Demo with 0 Perameter");
	}
	Demo(String s){
		this(25);
		System.out.println("Inside Demo with String Parameter");
	}
	Demo(int i){
		this(10.55f);
		System.out.println("Inside Demo with Integer Parameter");
	}
	Demo(float f){
		System.out.println("Inside Demo with Float Parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
		

	}

}
