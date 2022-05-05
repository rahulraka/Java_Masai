package com.S4D4.ques2;

import java.io.*;

public class Write {

	public static void main(String[] args) throws Exception {
		File f=new File("abc.txt");
		System.out.println(f.exists());
		if(f.exists()!=true) {
			f.createNewFile();
			System.out.println(f.exists());
		}
			FileWriter fr=new FileWriter(f);
			PrintWriter fw=new PrintWriter(fr);
			fw.println("Rahul");
			fw.println("Raja");
			fw.println("Nahmush");
			fw.println("Satya");
			fw.println("Aman");
			fw.close();
			System.out.println("File created Successfully");
			
		
		// TODO Auto-generated method stub

	}

}
