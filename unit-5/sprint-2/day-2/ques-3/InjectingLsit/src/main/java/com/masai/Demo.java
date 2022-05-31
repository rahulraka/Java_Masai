package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt =new ClassPathXmlApplicationContext("applicationContext.xml");
		CityList cl=cxt.getBean("city",CityList.class);
		cl.show();
		
		
	
		Student st=cxt.getBean("stuList",Student.class);
		List<Student> ans=st.getStudents();
		for(Student s:ans) {
			System.out.println(s);
			System.out.println("========================================================================");
			
		}
		ClassPathXmlApplicationContext cxt2= (ClassPathXmlApplicationContext)cxt;
		cxt2.close();
		
	
		

	}

}
