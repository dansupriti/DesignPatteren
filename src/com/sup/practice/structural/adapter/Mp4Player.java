package com.sup.practice.structural.adapter;

/**
 * Created by ACER on 11-02-2017.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName){
    }

    @Override
    public void playMp4(String fileName){
        System.out.println("playing Mp4 file. Filename is ::" + fileName);
    }
}
