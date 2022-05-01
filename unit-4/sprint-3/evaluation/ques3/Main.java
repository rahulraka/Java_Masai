package com.Eval3.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Playlist p1=new Playlist();
		for(int i=0;i<4;i++) {
			System.out.println("Please Enter Movie Name followed by the Song Name :");
			Song s1=new Song();
			s1.movieName=sc.next();
			s1.songName=sc.next();
			p1.addSong(s1);
			System.out.println(" ");
		}
		for(Song s:p1.al) {
			s.play();	
		}
	
		
sc.close();
	}
	

}
