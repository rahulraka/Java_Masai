package com.S4D2.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class Demo {

	public static void main(String[] args) {
		
		
		
		
	List<Student> ls=new ArrayList<>();
		
ls.add(new Student(14,"Najmush", 450));
ls.add(new Student(13,"Rahul", 350));	
ls.add(new Student(16,"Satya", 100));	
ls.add(new Student(15,"Raja", 200));	
ls.add(new Student(17,"Anchal", 100));	
	
		System.out.println(ls);
		Collections.sort(ls,(s1,s2)-> s1.getRollNo()>s2.getRollNo()? +1: -1 );
		Stream<Student> ss=ls.stream().filter(s-> s.isMarks()<250);
		ss.forEach(s-> System.out.println(s));
//		System.out.println(ls);
//		ls.removeIf(s-> s.isMarks()<250);
//		System.out.println(ls);
		

	
	}

}
