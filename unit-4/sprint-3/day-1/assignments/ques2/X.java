package com.S3D1.ques2;

public interface X {
	void method1();
	default public void method2() {
		System.out.println("Hello from default Method2");
	}
	public static void method3() {
	System.out.println("Hello from static method3");	
	}
	

}
