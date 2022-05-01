package com.S4D3.ques3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Common c1=new Common();
		Common c2=new Common();
		
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.start();
		
		
		t2.start();
		


	}

}
