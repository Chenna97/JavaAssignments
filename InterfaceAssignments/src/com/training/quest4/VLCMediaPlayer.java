package com.training.quest4;

public class VLCMediaPlayer implements IMediaPlayer {

	@Override
    public void playMusic() {
        System.out.println("Play mp3 files");
    }

    @Override
    public void downloadMusic() {
        System.out.println("Download files as mp3");
    }

    public void playVideo() {
        System.out.println("Play mkv files");
    }

}
