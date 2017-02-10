package com.sup.practice.creational.structural.adapter.adapter;

/**
 * Created by ACER on 11-02-2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("playing vlc file. Filename is ::" + fileName);
    }
    public void playMp4(String fileName){}
}
