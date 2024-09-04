package com.driver;

public class Song {
    private String title;
    private int length;
    private int likes;
    private String titleName;
    private String mobile;


    public Song(){

    }

    public Song(String title, int length,String titleName,String mobile){
        this.mobile=mobile;
        this.title = title;
        this.length = length;
        this.titleName=titleName;
    }

   public String getMobile(){return mobile;}

    public void setMobile(String mobile){this.mobile=mobile;}
    public String getTitleName(){return titleName;}
    public void setTitleName(String titleName){this.titleName=titleName;}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
