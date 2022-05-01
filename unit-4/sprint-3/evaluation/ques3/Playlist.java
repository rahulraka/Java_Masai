package com.Eval3.ques3;

import java.util.ArrayList;

public class Playlist {
	ArrayList<Song> al = new ArrayList<>();
	
	void addSong(Song song) {
		boolean flag=true;
		for(Song s:al) {
			if(s.movieName.equals(song.movieName) && s.songName.equals(song.songName)) {
				flag=false;
			}
		}
		if(flag) {
			this.al.add(song);
			System.out.println("Song added to the playlist successfully.");			
		}
		else {
			System.out.println("Song is already added to the playlist");
		}
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		for(Song s:al) {
//			return s.play();
//		}
//		
//	}
	
	
}
