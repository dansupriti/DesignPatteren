package com.sup.practice.structural.adapter;

/**
 * Created by ACER on 11-02-2017.
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }else{
            System.out.println("AudioType not supported." + audioType);
        }
    }
}
