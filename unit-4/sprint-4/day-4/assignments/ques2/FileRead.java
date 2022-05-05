package com.S4D4.ques2;

import java.io.*;

public class FileRead {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		
		
		File f=new File("abc.txt");
		 
		FileReader fr = new FileReader(f);
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
		

	}

}
