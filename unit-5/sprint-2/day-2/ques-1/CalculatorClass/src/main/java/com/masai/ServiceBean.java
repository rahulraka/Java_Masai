package com.masai;

public class ServiceBean {
	private int x;
	public ServiceBean(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	private int y;
	void calculateSum() {
		System.out.println("Data is Summed "+x+y);
	}
	void calculateMultiplication() {
		System.out.println("Data is Multiplied "+x*y);
	}
	void calculateSubtraction() {
		System.out.println("Data is Subtracted "+ (x-y));
	}
	public ServiceBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
