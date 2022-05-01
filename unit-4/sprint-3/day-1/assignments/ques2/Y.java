package com.S3D1.ques2;

public interface Y {
	void method4();
	default void method5() {
		System.out.println("Hello from default Method5");
	}
	public static void method6() {
	System.out.println("Hello from static method6");	
	}
}
