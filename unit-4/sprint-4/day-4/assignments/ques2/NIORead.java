package com.S4D4.ques2;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIORead {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("abc.txt");
		List<String> data = Files.readAllLines(p);
		
		for(String s: data) {
			System.out.println(s);
		}

	}

}
