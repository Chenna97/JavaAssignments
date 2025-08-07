package com.training.quest4;

import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select v as VLCMediaPlayer / w as Windowas Media Player ");
		String choice = sc.next().toLowerCase();
		IMediaPlayer iMediaPlayer = null;
		
		if(choice.equals("v")) {
			
			iMediaPlayer =new VLCMediaPlayer();
			iMediaPlayer.playMusic();
			iMediaPlayer.downloadMusic();
			
			VLCMediaPlayer vlcMedia = (VLCMediaPlayer) iMediaPlayer;
			vlcMedia.playVideo();
			
		}
		else if (choice.equals("w")) {
			
			iMediaPlayer =new WindowsMediaPlayer11();
			iMediaPlayer.downloadMusic();
			iMediaPlayer.playMusic(); 
			
			WindowsMediaPlayer11 wpl = (WindowsMediaPlayer11)iMediaPlayer;
			wpl.playVideo();
			wpl.playMusic();
			wpl.downloadMusic();
			
		}
		
		else {
			
			System.out.println("Invalid Input");
		}
sc.close();
	}

}
