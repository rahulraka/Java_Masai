package com.S4D4.ques1;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;

public class Demo implements Serializable{

	public static void main(String[] args) throws Exception {
		
		
		Student s1=new Student(11,"Rahul", new Address("Delhi","110044","New Delhi"), "ask","123");
		
		
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		FileInputStream fin=new FileInputStream("student.txt");
		ObjectInputStream oo=new ObjectInputStream(fin);
		System.out.println(oo.readObject());
		
		
			
		

	}

}
