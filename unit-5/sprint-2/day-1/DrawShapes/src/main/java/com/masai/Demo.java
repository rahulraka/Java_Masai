package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Shapes obj=cxt.getBean("tr",Shapes.class);
		obj.draw();
		

	}

}
