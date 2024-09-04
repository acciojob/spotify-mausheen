package com.driver;

import java.util.List;

public class Playlist {
    private String title;

    private String mobile;
    private int length;
    private List<String> songTitles;
    public Playlist(){

    }

    public Playlist(String title,String mobile,int length,List<String> songTitles){
        this.title = title;
        this.mobile=mobile;
        this.length=length;
        this.songTitles=songTitles;
    }

    public List<String> getSongTitles(){return songTitles;}
    public void setSongTitles(List<String> songTitles){this.songTitles=songTitles;}
    public String getMobile(){return mobile;}
    public int getLength(){return length;}

    public void setMobile(String mobile){this.mobile=mobile;}
    public void setLength(int length){this.length=length;}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
