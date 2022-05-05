package com.S4D4.ques2;

import java.io.*;

public class BuffRead {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());
		 
			FileReader fr = new FileReader(f);
			BufferedReader bw=new BufferedReader(fr);
			
			System.out.println(bw.readLine());
			System.out.println(bw.readLine());
			System.out.println(bw.readLine());
			System.out.println(bw.readLine());
			System.out.println(bw.readLine());
			
	}

}
