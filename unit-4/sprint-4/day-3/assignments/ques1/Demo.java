package com.S4D3.ques1;

public class Demo {

	public static void main(String[] args){
		Product p1=new Product();
		Thread t1=new Thread(p1);
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total of Product fun is :"+p1.sum);
	}

}
