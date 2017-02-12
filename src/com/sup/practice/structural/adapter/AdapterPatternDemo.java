package com.sup.practice.structural.adapter;

/**
 * Created by ACER on 11-02-2017.
 */
public class AdapterPatternDemo {
    public static void main(String args[]){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "fileName.vlc");
        audioPlayer.play("mp3", "fileName.mp3");
        audioPlayer.play("mp4", "fileName.mp4");
        audioPlayer.play("avi", "fileName.avi");
    }
}
