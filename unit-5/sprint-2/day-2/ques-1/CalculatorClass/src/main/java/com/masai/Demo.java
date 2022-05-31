package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext sxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationBean prb=sxt.getBean("pb",PresentationBean.class);
		prb.presenting();
	}
	
}
