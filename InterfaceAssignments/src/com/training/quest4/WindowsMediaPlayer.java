package com.training.quest4;

public abstract class WindowsMediaPlayer implements IMediaPlayer{

	// playVideo(){add a print statement as play mp4  files} 
	
	    @Override
	    public void playMusic() {
	        System.out.println("Play mp3 files");
	    }

	    public void playVideo() {
	        System.out.println("Play mp4 files");
	    }
}
