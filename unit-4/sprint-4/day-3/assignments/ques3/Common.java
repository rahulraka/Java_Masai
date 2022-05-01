package com.S4D3.ques3;

public class Common implements Runnable{
	
	

	@Override
	public void run() {
		
		
				System.out.println("This is run"+Thread.currentThread().getName());
				new Common().fun1();
				new Common().fun2();
				new Common().fun3();

		
	}
	
	
	public static synchronized void fun1() {
		System.out.println("This is fun1 "+Thread.currentThread().getName());
		
	}
	
	public static synchronized void fun2() {
		System.out.println("this is fun2 "+Thread.currentThread().getName());
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	
		
	}
	
	 void fun3() {
		System.out.println("Hello fun3"+Thread.currentThread().getName());
	}


}
